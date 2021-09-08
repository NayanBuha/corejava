package Exceptions.App;

public class App {

	public static void main(String[] args) {

		int i = 50;
		int j = 0;
		int data;
		try {
			data = i / j;

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}
