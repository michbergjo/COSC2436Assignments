// Michelle Joseph 
//Assignment 9.1 part 2

package chpt9;

public class TestRectangle {

	public static void main(String[] args) {
		// test program for Rectangle class
		
		testRectangle(4, 40);
		testRectangle(3.5, 35.9);
		

	}

	public static void testRectangle(double width, double height) {
		Rectangle rectangle = new Rectangle(width, height);
		System.out.println("The width of this rectangle is: " + width);
		System.out.println("The height of this rectangle is: " + height);
		System.out.println("The area of this rectangle is: " + rectangle.getArea());
		System.out.println("The perimeter of this rectangle is: " + rectangle.getPerimeter());
	}
}
