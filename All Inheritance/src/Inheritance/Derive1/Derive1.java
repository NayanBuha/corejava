package Inheritance.Derive1;

class Base {
	int a, b;

	public void get(int x, int y) {
		a = x;
		b = y;
		System.out.println(a);
		System.out.println(b);
	}
}

class Derive extends Base {
	public void Demo() {
		System.out.println("Thid is get method");
	}
}

public class Derive1 {

	public static void main(String[] args) {
		Derive div = new Derive();
		div.get(5, 6);
		div.Demo();
	}
}
