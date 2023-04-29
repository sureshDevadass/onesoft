
public class StaticDifferance {
	
	static int a=10;
	
	public static void toPrint() {
	     int a=20;
		System.out.println(a);

	}
	public static void main(String[] args) {
		a=20;
		System.out.println(a);
		toPrint();
		System.out.println(a);
		
	}

}
