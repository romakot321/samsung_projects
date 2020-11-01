package samsung;

public class cls {
	
	public static void main(String[] args) {
		Square s = new Square(5, 1, 1);	
		System.out.println(s);
		System.out.println(s.diagonal());
		
		Rectangle r = new Rectangle(3, 5, 2, 1);
		System.out.println(r);
		System.out.println(r.area());
	}
}