package samsung;

public class Rectangle extends Square {
	private int b;
	

	public Rectangle() {
		a = 1;
		b = 1;
		x = 0;
		y = 0;
	}
	public Rectangle(int a, int b, int x, int y) {
		this.a = a;
		this.b = b;
		this.x = x;
		this.y = y;
	}
	
	public int area() {
		return a * b;
	}
	
	@Override
	public String toString() {
		return "Side 1: " + a + ", side 2: " + b + "\n X: " + x + ", Y: " + y;
	}
}
