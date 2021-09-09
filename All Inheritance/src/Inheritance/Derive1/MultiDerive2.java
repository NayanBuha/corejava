package Inheritance.Derive1;

class Wooden {
	String type;

	public void getType() {
		type = "Saag";
		System.out.println("Chair type : " + type);
	}
}

class Furniture extends Wooden {
	int h;
	int w;

	public void getSize() {
		h = 8;
		w = 10;
		System.out.println("Chair height : " + h);
		System.out.println("Chair Width : " + w);
	}
}

class Chair extends Furniture {
	int leg;

	public void getLeg() {
		leg = 4;
		System.out.println("Chair Lag : " + leg);
	}
}

public class MultiDerive2 {
	public static void main(String args[]) {
		Chair chair = new Chair();
		chair.getType();
		chair.getSize();
		chair.getLeg();
	}
}
