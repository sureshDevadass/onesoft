
public class FinalizeMethod {

	String name;

	public FinalizeMethod(String name) {

		this.name = name;
	}

	@Override
	protected void finalize() {

		System.out.println(name + " is Being Destroyed");
	}

	public static void main(String[] args) {

		FinalizeMethod f = new FinalizeMethod("Object1");
		FinalizeMethod f1 = new FinalizeMethod("Object2");

		System.out.println(f.name);
		System.out.println(f1.name);

		System.out.println("-------------");

		f1 = null;
		System.gc();
		System.out.println(f.name);

	}

}
