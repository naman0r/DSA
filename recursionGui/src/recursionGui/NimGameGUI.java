package recursionGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class NimGameGUI {

    private JFrame frame;
    private JLabel label;
    private StonesPanel stonesPanel;
    private ArrayList<JButton> buttons = new ArrayList<>();
    private int[] rowsSticks;
    private int frozenRow = -1; 

    public NimGameGUI(int totalRows){
        frame = new JFrame("Nim Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        label = new JLabel("Nim Game");
        frame.add(label, BorderLayout.NORTH);

        rowsSticks = new int[totalRows];
        createRowButtons(0, totalRows);

        stonesPanel = new StonesPanel(totalRows);
        frame.add(stonesPanel, BorderLayout.CENTER);
        stonesPanel.setRowsSticks(rowsSticks);

        frame.pack();
        frame.setVisible(true);
    }

    private void createRowButtons(int currentRow, int totalRows) {
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

    private class ButtonListener implements ActionListener {
        private int rowIndex;
        private int maxSticks;

        public ButtonListener(int rowIndex, int maxSticks) {
            this.rowIndex = rowIndex;
            this.maxSticks = maxSticks;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
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

    private class StonesPanel extends JPanel {
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
