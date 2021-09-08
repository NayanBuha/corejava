package Wrapper.equal;

public class equal {

	public static void main(String[] args) {

		Integer obj1 = new Integer(10);
		Integer obj2 = new Integer("25");
		Integer obj3 = new Integer(10);

		System.out.println("Comapare to :" + obj1.compareTo(obj3));
		System.out.println("Comapare to :" + obj1.compareTo(obj2));
	}
}
