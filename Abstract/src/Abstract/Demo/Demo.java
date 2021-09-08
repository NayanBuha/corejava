package Abstract.Demo;

import Abstract.Demo.person.NonVegan;
import Abstract.Demo.person.Person;
import Abstract.Demo.person.Vegan;

public class Demo {

	public static void main(String[] args) {
		
		Person pa = new Vegan();
		pa.eat();
		
		Person pa1 = new NonVegan();
		{
			pa1.eat();
		}

	}
}
