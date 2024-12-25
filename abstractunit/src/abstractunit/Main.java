package abstractunit;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//
		
		//ArrayList<T> circs= new ArrayList<>(); 
		
		

	}
	
	
	public static abstract class Shape {
		
		protected String color; 
		protected String name; 
		
		public Shape(String c, String name){
			this.color = c; 
			this.name = name; 
		}
		public abstract double getArea(); 
		public String getColor() {
			return this.color; 
		}
	}
	
	
	public static interface Geometry{
		
		
		public String printSmthn(); 
		public <T extends Shape> void printGen( T thingToPrint); 
	}
	
	
	public static class Square extends Shape implements Geometry, Comparable <Shape> {
			
		
			protected int sideL; 
			public Square( String color, String name, int s) {
				super(color, name);
				this.sideL = s; 
			}
			
			
			public <T extends Shape> void printGen( T thingToPrint) {
				System.out.print(thingToPrint);
			}
			
			
			@Override
			public int compareTo(Shape o) {
				// TODO Auto-generated method stub
				return (int) (this.getArea() - o.getArea());
			}
			@Override
			public String printSmthn() {
				// TODO Auto-generated method stub
				return "THIS IS A SQUARE WITH " + sideL + " M SIDE LENGTH ";
			}
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return sideL*sideL; 
			}
			
			@Override 
			public String toString() {
				
				return "This is a circle with a sideL of " + sideL + " m and a name " + this.name + ". ";
			}
		}


	
	public static class Circle extends Shape implements Geometry,Comparable <Shape>{

		private int radius; 
		
		public Circle(String c, String name,  int r) {
			super(c, name);
			radius = r; 
			// TODO Auto-generated constructor stub
		}
		
		public <T extends Shape> void printGen( T thingToPrint) {
			System.out.print(thingToPrint);
		}

		@Override
		public String printSmthn() {
			// TODO Auto-generated method stub
			return "THIS IS A CIRCLE WITH " + radius + " M RADIUS ";
		}

		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return Math.PI*radius*radius; 
		}

		@Override  //for the comparable interface to work 
		public int compareTo(Shape o) {
			// TODO Auto-generated method stub
			return (int) (this.getArea() - o.getArea());
		}
		
		@Override 
		public String toString() {
			
			return "This is a circle with a radius of " + radius + " m and a name " + this.name + ". ";
		}
		
		public static void main( String[] args) {
			
			System.out.println("Hello");
			Circle my = new Circle("Blue","cir1", 17);
			//System.out.println(my.toString());
			ArrayList<Shape> ar = new ArrayList<>(); 
			
			ar.add(my);
			ar.add( new Circle("blue","cir2", 6));
			ar.add( new Circle("blue","cir2", 7));
			ar.add(new Square("orange", "sq1", 14));
			ar.add(new Square("green", "sq2", 12));
			
			System.out.println(ar.toString());
			ar.sort(null);
			System.out.println(ar.toString());
			
			Iterator<Shape> it = ar.iterator();
			
			while( it.hasNext()) {
				System.out.println(it.next().getArea()); 
			}
			
			my.printGen(new Square("YoMama", "test", 69));
		}
		
	 		
		
		/**NOTES
		 *while implementing and extending, extends has to come before implementing. 
		 *can only extend one superclass, can implement as many interfaces as needed. 
		 * implementing comparable makes it easy for you to sort a List of 
		 */
		
	}
	
}
