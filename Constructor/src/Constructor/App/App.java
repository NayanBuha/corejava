package Constructor.App;

public class App {
	int x;
	int y;
	int z;

	public App(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.z = x+y;
	}
	public static void main(String args[]) {

		App a = new App(5,6);
		System.out.println(a.z);
	}
}
