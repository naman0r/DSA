package gradeBookProject;

/****************************************************
**
** TotalPointsGradebook class
**
** This class represents a Gradebook that calculates
** grades according to the total points grading system.
**
****************************************************/
import java.util.ArrayList;

// this class should implement the Gradebook interface
public class TotalPointsGradebook implements Gradebook {
    private ArrayList<Assignment> myGrades;
    
    // TotalPointsGradebook constructor
    //
    // postcondition: myGrades is instantiated
    public TotalPointsGradebook() {
        myGrades = new ArrayList<Assignment>();
    }
    
    // add mutator method
    //
    // postcondition: the given Assignment object is added to myGrades
    public void add(Assignment assign) {
        /*
    	if ( myGrades!= null){
            myGrades.add(assign);
        }
        else{
            //myGrades is null and constructor has not been called. 
        }
        */
    	myGrades.add(assign);
    }
    
    // calculateGrade accessor method
    //
    // postcondition: the grade represented by myGrades is calculated and
    // returned, according to the total points grading system. The value is
    // the sum of the points earned on all Assignments in this Gradebook, 
    // divided by the sum of the points possible on all Assignments in 
    // this Gradebook, and is converted to a value between 0 and 100, 
    // inclusive. 
    public double calculateGrade() {

        double earned = 0; 
        double possible= 0; 
        
        for( int i = 0; i <myGrades.size(); i++){
            earned += myGrades.get(i).getPointsEarned(); 
            possible += myGrades.get(i).getPointsPossible(); 
        }
        
        return ((earned/possible)*100);
    }
}
