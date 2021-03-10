package chpt13;

public class Circle9 extends GeometricObject {
	
	public Circle9() {
		this(1.0);
		System.out.print("C");
	}
	
	public Circle9(double radius) {
		this(radius, "white", false);
		System.out.print("D");
	}
	
	public Circle9(double radius, String color, boolean filled) {
		super(color, filled);
		System.out.print("E");
	}
}
