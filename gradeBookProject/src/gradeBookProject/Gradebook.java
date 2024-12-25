package gradeBookProject;

//this is an interface, since we will have more than one type of gradebook

interface Gradebook{
	
 double calculateGrade();

 void add(Assignment tempAssign);
}