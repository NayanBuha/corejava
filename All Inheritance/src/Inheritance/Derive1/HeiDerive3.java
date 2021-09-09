package Inheritance.Derive1;

class A {
	public void get() {
		System.out.println("This is class a Information");
	}
}

class B extends A {
	public void show() {
		System.out.println("Class B extends A");
	}
}

class C extends A {
	public void demo() {
		System.out.println("Class C extends A ");
	}
}

class D extends A {
	public void disp() {
		System.out.println("Class D extends A");
	}
}

public class HeiDerive3 {

	public static void main(String[] args) {

		B b = new B();
		C c = new C();
		D d = new D();

		b.get();
		c.get();
		d.get();

		b.show();
		c.demo();
		d.disp();
	}
}
