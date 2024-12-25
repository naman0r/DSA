
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class NimGameGUI {
	
	//declaring instance variables and setting them to private so that they cannot be manipulated in other classes:

    private JFrame frame;
    private JLabel label;
    private StonesPanel stonesPanel;
    private ArrayList<JButton> buttons = new ArrayList<>();
    private int[] rowsSticks;
    private int frozenRow = -1; 

    public NimGameGUI(int totalRows) {  //GUI constructor. Basically creates the window and game. 
        frame = new JFrame("Nim Game");  //name that appears on the top of the window. Defining previously declared object
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //allows user to close window after game is over. 
        frame.setLayout(new BorderLayout());  // sets a layout manager for JFrame. Allows us to place things north south east west or center wifthin the frame 

        label = new JLabel("Nim Game");  // Label at top of the window, within the window
        frame.add(label, BorderLayout.NORTH); //adding label defined in the above line to align to the north of window. 

        rowsSticks = new int[totalRows];  // array that keep track of the number of stones in different rows. 
        this.createRowButtons(0, totalRows);  // calling method defined below.  Creates a button for each row because row size can change and user needs to be b 

        stonesPanel = new StonesPanel(totalRows);  //defining an instance of StonesPanel class, created to help recursively visualize stones....
        frame.add(stonesPanel, BorderLayout.CENTER);  //asking to position this panel of 'stones' at the center of frame, or window. 
        stonesPanel.setRowsSticks(rowsSticks);  //method defined in class below. 

        frame.pack();
        frame.setVisible(true);
        //JButton button2 = new JButon("Intsructions here");
    }

    private void createRowButtons(int currentRow, int totalRows) { // This method creates the buttons for each row and adds them to the frame.

        JPanel buttonPanel = new JPanel();  
        buttonPanel.setLayout(new GridLayout(totalRows, 1));

        for (int i = 0; i < totalRows; i++) {
            int sticksForRow = 2 * i + 1;
            rowsSticks[i] = sticksForRow;
            JButton button = new JButton("Remove from row " + (i + 1));
            button.addActionListener(new ButtonListener(i, sticksForRow));
            buttons.add(button);
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.EAST);
    }

    private void freezeRandomRow(int totalRows) {
        frozenRow = new Random().nextInt(totalRows);
        stonesPanel.repaint();
    }
    
    // starts here
    private class ButtonListener implements ActionListener {
        private int rowIndex;
        private int maxSticks;

        public ButtonListener(int rowIndex, int maxSticks) {
            this.rowIndex = rowIndex;
            this.maxSticks = maxSticks;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (rowIndex == frozenRow) {
                JOptionPane.showMessageDialog(frame, "This row is frozen! You cannot remove stones from it this turn.");
                return;
            }

            String input = JOptionPane.showInputDialog(frame, "How many stones to remove from row " + (rowIndex + 1) + "? (max " + maxSticks + ")");
            try {
                int removeStones = Integer.parseInt(input);
                if (removeStones >= 1 && removeStones <= maxSticks) {
                    rowsSticks[rowIndex] -= removeStones;
                    stonesPanel.repaint();
                    freezeRandomRow(rowsSticks.length);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid number of stones!");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid number!");
            }
        }
    }

    
    //ends here

    private class StonesPanel extends JPanel {  //private class, subclass of JPanel 
        private int[] rowsSticks;
        private final int STONE_DIAMETER = 20;

        public StonesPanel(int totalRows) {
            this.setPreferredSize(new Dimension(300, STONE_DIAMETER * totalRows));
            this.setBackground(Color.WHITE);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int i = 0; i < rowsSticks.length; i++) {
                int xOffset = 10;
                for (int j = 0; j < rowsSticks[i]; j++) {
                    if (i == frozenRow) {
                        g.setColor(Color.BLUE);
                    } else {
                        g.setColor(Color.RED);
                    }
                    g.fillOval(xOffset, i * (STONE_DIAMETER + 5), STONE_DIAMETER, STONE_DIAMETER);
                    xOffset += STONE_DIAMETER + 5;
                }
            }
        }

        public void setRowsSticks(int[] rowsSticks) {
            this.rowsSticks = rowsSticks;
        }
    }

    public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> new NimGameGUI(5));
    }
}

