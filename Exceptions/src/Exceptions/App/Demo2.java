package Exceptions.App;

public class Demo2 {

	public static void main(String[] args) {

		try {
			int data = 25 / 0;
			System.out.println("Hello try block");

		} catch (Exception e) {
			System.out.println(e);

		} finally {
			System.out.println("Finally block is always executed");
		}
	}
}
