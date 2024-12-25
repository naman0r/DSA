import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AssemblyLine
{
        private Queue<Disk> assemblyLineIn;
        private Queue<Pyramid> assemblyLineOut;
        private Pyramid robotArm;
        /**
            * initializes this object so the assemblyLineIn contains 
            * nDisks with random radii;  assemblyLineOut is initialized to * an empty Queue; robotArm is initialized to an empty Pyramid.
            **/
        //Part A
        public AssemblyLine( int nDisks, int maxRadius )
        {	
        	assemblyLineIn = new LinkedList<Disk>(); 
        	
        	for(int i = 0; i < nDisks; i++) {
        		int rnum = (int)(Math.random()* maxRadius +1); //should create a random number between 1 and max radius inclusive. 
        		assemblyLineIn.add(new Disk(rnum));
        	}
        	
        	assemblyLineOut = new LinkedList<Pyramid>(); 
        	robotArm = new Pyramid(); 
        
        }
    
        /**
            * "flips over" the pyramid in the robotArm and adds it to the
            * assemblyLineOut queue.
            * Precondition:  robotArm is not empty and holds an inverted 
            *				pyramid of disks
            **/
        // Part B
        private void unloadRobot()
        { 
        	
        	Pyramid temp = new Pyramid();
        	while(!robotArm.isEmpty()) {
        		temp.push(robotArm.pop());
        	}
        	
        	assemblyLineOut.add(temp);        	
        
        }
    
        /**
            * processes all disks from assemblyLineIn; a disk is processed
            * as follows:  if robotArm is not empty and the next disk does
            * not fit on top of robotArm (which must be an inverted 
            * pyramid) then robotArm is unloaded first; the disk from
            * assemblyLineIn is added to robotArm; when all the disks
            * have been retrieved from assemblyLineIn, robotArm is unloaded.
            *  Precondition:  robotArm is empty;
            *				assemblyLineOut is empty
            **/
        //Part C
        public void process(){
        	
        	
       
        	
        	if( assemblyLineIn.isEmpty()) {  //base condition.
        		return;
        	}
        	else {
        		if(robotArm.isEmpty()) {
            		robotArm.add(assemblyLineIn.remove());
            	}
            	
            	while(!assemblyLineIn.isEmpty() && robotArm.peek().compareTo(assemblyLineIn.peek()) <= 0) {  //next element in line is more than or equal to than peak of robotarm
            		
            		robotArm.add(assemblyLineIn.remove());
            		
            	}
            	
            	unloadRobot(); 
            	process();
        		
        	}
      	
        	
        }
        
        public void showInput()
        {
            System.out.println(assemblyLineIn.toString());
        }
        public void showOutput()
        {
            System.out.println(assemblyLineOut.toString());
        }
    }
