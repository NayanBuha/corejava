package Static.Function;

public class Function {
	static int x = 5;
	static int y;

	static void display(int z) {
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println("Z = " + z);
	}

	static {
		System.out.println("Ststic initialization block");
		y = x + 5;

	}

	public static void main(String[] args) {

		display(9);
	}
}
