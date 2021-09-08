package SuperVariable.Example;


class Vehical {
	
	int maxSpeed=150;
}
class Car extends Vehical{
	int maxSpeed=180;
	
	void diplay() {
		System.out.println("Maximum speed :" +super.maxSpeed);
		System.out.println("Maximum speed : "+this.maxSpeed);
	}
}
public class Example {

	public static void main(String[] args) {
		
		Car car=new Car();
		car.diplay();
	}
}
