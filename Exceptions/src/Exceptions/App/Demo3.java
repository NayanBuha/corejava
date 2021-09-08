package Exceptions.App;

public class Demo3 {

	public void check(int num) {
		if (num < 1) {
			throw new ArithmeticException("Number is negative cannot calculate squre ");
		} else {
			System.out.println("Squre of num: " + num * num);
		}
	}

	public static void main(String[] args) {

		Demo3 D = new Demo3();
		D.check(-3);
	}
}
