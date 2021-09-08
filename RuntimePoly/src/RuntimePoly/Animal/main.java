package RuntimePoly.Animal;

class Animal{

	public void animalSound() {
		System.out.println("Animal make sound");
	}
}

	 class Dog extends Animal {
		public void animalSound() {
			System.out.println("The dog say : wow wow");
		}
	}
 class main {
	
	public static void main(String[] args) {
		
		Animal myAnimal= new Animal();
		Dog myDog = new Dog();
		
		myAnimal.animalSound();
		myDog.animalSound();
	}
}
