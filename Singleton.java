

//Lazy Instantiation
public class Singleton {

	private static Singleton instance;
	private static String name = "suresh";

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}

	public static String getName() {

		return name;
	}

	public static void main(String[] args) {

		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getName());
		Singleton.name = "Ruthra";
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getName());

	}
}
