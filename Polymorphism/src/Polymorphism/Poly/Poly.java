package Polymorphism.Poly;

public class Poly {

	public static int add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {

		System.out.println(add(5, 4));
		System.out.println(add(2.0, 4.0));
	}
}
