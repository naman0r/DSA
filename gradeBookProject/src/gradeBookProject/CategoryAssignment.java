package gradeBookProject;

/****************************************************
**
** CategoryAssignment class
**
** This class represents an CategoryAssignment.
** Do not add any additional methods to this class.
**
****************************************************/
public class CategoryAssignment extends Assignment {
    // declare any new instance variables that you need here
    // don't forget to make them private!
    // don't declare more that you really need!
    String categoryName;  
    // CategoryAssignment constructor
    //
    // postcondition: all instance variables are initialized with
    // the given values.     
    public CategoryAssignment (String name, double pointsPossible, double pointsEarned,  String catName ) {
        super(name, pointsPossible, pointsEarned);
        categoryName = catName; 
    }
    
    // getCategoryName accessor method
    //
    // postcondition: returns the name of the category associated
    // with this CategoryAssignment
    public String getCategoryName() {
        return categoryName; 
    }
    
    public String toString() {// for testing purposes, since code not working. 
    	return name + ", " + categoryName + ", " + pointsEarned +"/"+ pointsPossible ;
    }
}
