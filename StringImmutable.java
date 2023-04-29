
public class StringImmutable {
	
	public static void main(String[] args) {
		
		String a="Suresh";
		System.out.println("a memory address"+a.hashCode());
		String b="Suresh";
		System.out.println("b memory address"+b.hashCode());
		String c="Devadass";
		System.out.println("c memory address"+c.hashCode());
		a=a.concat(c);
		System.out.println(a);
		System.out.println("a memory address after concat "+a.hashCode());
	}

}
