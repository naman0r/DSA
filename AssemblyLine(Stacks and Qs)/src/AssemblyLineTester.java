//Name:     Naman Rusia   
//Date:		11th march 2024
import java.util.*;
public class AssemblyLineTester
{
        static int NDISKS = 50;
        static int MAXRADIUS = 100;
        public static void main(String[] args){  //driver
        	
            AssemblyLine a = new AssemblyLine(NDISKS, MAXRADIUS);
            a.showInput();
            a.process();
            System.out.println("");
            a.showOutput();
            
        }
}
    


