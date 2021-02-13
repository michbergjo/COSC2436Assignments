// Michelle Joseph 
//Assignment 9.1 part 1

package chpt9;

public class Rectangle {
	double width = 1;
	double height = 1;
	
	//no arg constructor
	public Rectangle() {
		
	}

	//constructor using width and height parameters 
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	//returns the area of a rectangle 
	public double getArea() {
		return this.width * this.height;
	}

	//returns the perimeter of a rectangle  
	public double getPerimeter() {
		return (this.width * 2) + (this.height * 2);
	}

	

}
