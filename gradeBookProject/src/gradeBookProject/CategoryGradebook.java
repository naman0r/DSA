package gradeBookProject;
import java.util.ArrayList;
/****************************************************
**
** CategoryGradebook class
**
** This class represents a CategoryGradebook that calculates
** grades according to the weighted category grading system.
**
****************************************************/
public class CategoryGradebook implements Gradebook {
    // Instance variables (set to private)
    private ArrayList<CategoryAssignment> catGrades;
    private String[] categories; 
    private int[] weights;
    
    // precondition: categories.length == weights.length;
    // categories contains the names of all categories in this Gradebook;
    // weights contains the values of the weights of each corresponding category;
    // each value in weights is between 0 and 100 inclusive
    // postcondition: all instance variables are initialized;
    // if sum of elements in weights is not equal to 100, then the weight of
    // the last category is adjusted so that the sum is equal to 100
    public CategoryGradebook(String[] cate, int[] weig) {
        categories = cate; 
        weights = weig; 
        catGrades = new ArrayList<CategoryAssignment>();
    }

    // calculateGrade accesor method
    //
    // postcondition: the grade represented by this Gradebook is calculated and
    // returned, according to the weighted category grading system. To calculate this
    // value, first calculate the average of all assignments in each category. Then,
    // multiply each of those values with the value of the weight for that category.
    // Finally, add the values together. This value is between 0 and 100, inclusive.
    // 
    // If your task can be made easier by adding private helper methods to this class,
    // then be sure that they are thoroughly documented with comments. 
    public double calculateGrade() {
        
        //Assignment[] allGradesCalc = new Assignment[categories.length]; 
        double[] possibleP = new double[categories.length];
        double[] earnedP = new double[categories.length];
        
        

        for (int i  = 0; i < categories.length; i++){
            for( int z = 0; z < catGrades.size() ; z++){
                if(catGrades.get(z).getCategoryName().equals(categories[i]) ){
                    possibleP[i] += catGrades.get(z).getPointsPossible();
                    earnedP[i] += catGrades.get(z).getPointsEarned();
                    System.out.println("adding '" + catGrades.get(z).getName() + "' of category '" + catGrades.get(z).getCategoryName() + "'");
                    System.out.println("Points possible: " +  catGrades.get(z).getPointsPossible());
                    System.out.println("Points earned: "  + catGrades.get(z).getPointsEarned());
                    
                }
            }
        }
        

        double gradeFinal = 0; 
        for( int i = 0; i < weights.length; i++){

           System.out.println("   - earned " + earnedP[i] + " points out of " + possibleP[i] + " for category '" + categories[i] + "'");
           gradeFinal+= (earnedP[i]/possibleP[i])* weights[i];
        }
        return gradeFinal; 
    }
    
    // add mutator method
    //
    // precondition: assign IS-A CategoryAssignment
    // postcondition: the given Assignment object is added to this Gradebook
    public void add(Assignment assign) {
        catGrades.add((CategoryAssignment) assign);
    }
}
