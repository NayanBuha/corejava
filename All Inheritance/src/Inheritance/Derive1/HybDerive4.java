package Inheritance.Derive1;

class Y {
	public void show() {
		System.out.println("Y");
	}
}

class W extends Y {
	public void disp() {
		System.out.println("W");
	}
}

class X extends Y {
	public void method() {
		System.out.println("X");
	}
}

class Z extends X {
	public void ver() {
		System.out.println("Z");
	}
}

public class HybDerive4 {

	public static void main(String[] args) {
		X obj1 = new X();
		Y obj2 = new Y();
		Z obj = new Z();
		W obj3 = new W();

		obj.ver();
		obj1.method();
		obj2.show();
		obj3.disp();
	}
}
