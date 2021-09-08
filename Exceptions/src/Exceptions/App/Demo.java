package Exceptions.App;

import java.io.IOException;

class demo1 {
	void method() {
		// System.out.println("normal flow");
		int a = 5;
		int b = 0;
		int c = a / b;
	}
}
public class Demo {

	public static void main(String[] args) throws IOException {
		demo1 m = new demo1();
		m.method();
	}
}
