package Interface.Demo;

interface Demo3 {
	void show();
}

class Demo4 implements Demo3 {

	@Override
	public void show() {
		System.out.println("Hello");
	}

	class Demo5 implements Demo3 {

		@Override
		public void show() {
			System.out.println("Java");
		}
	}

	public static void main(String args[]) {

		Demo3 obj = new Demo4();
		obj.show();
	}
}
