package gradeBookProject;

/****************************************************
**
** Assignment class
**
** This class represents an Assignment. 
**
**
****************************************************/
public class Assignment {
        String name;           
        double pointsPossible;
        double pointsEarned;

    // Assignment constructor
    //
    // postcondition: all instance variables are initialized with
    // the given values. 
    public Assignment (String n, double pp, double pe) {
        name = n;
        pointsPossible = pp; 
        pointsEarned = pe; 


    }
    
    // zero argument constructor - call the other one and set
    // name = "unknown", pointsPossible and pointsEarned to zero
    public Assignment() {
        name = "unknown";
        pointsPossible = 0; 
        pointsEarned = 0;
    }
    
    // getName accessor method
    //
    // postcondition: returns the name of this Assignment
    public String getName() {
        return name; 
    }
    
    // getPointsPossible accessor method
    //
    // postcondition: returns the points possible for this Assignment
    public double getPointsPossible() {
        return pointsPossible; 
    }
    
    // getPointsEarned accessor method
    //
    // postcondition: returns the points earned for this Assignment
    public double getPointsEarned() {
        return pointsEarned; 
    }
}
