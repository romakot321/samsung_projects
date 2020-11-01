package samsung;

public class Square {
	int a, x, y;
	
	public Square() {
		a = 1;
		x = 0;
		y = 0;
	}
	public Square(int a, int x, int y) {
		this.a = a;
		this.x = x;
		this.y = y;
	}
	
	public double diagonal() {
		return a * 1.41421356237;
	}

	@Override
	public String toString() {
		return "Side: " + a + "; X: " + x + ", Y: " + y;
	}
}
