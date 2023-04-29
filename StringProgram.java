
public class StringProgram {
	
	public static void main(String[] args) {
		
		String s= "welcome";
		String s1="welcome";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		 s = s.concat(s1);
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		System.out.println("-----------");
		
		String m=new String("Hello");
		String m1=new String(" WORLD");
		System.out.println(m.hashCode());
		System.out.println(m1.hashCode());
		m=m.concat(m1);
		System.out.println(m);
		System.out.println(m.hashCode());
		
		System.out.println("-----------");
		
		StringBuffer sb=new StringBuffer("Kamal");
		System.out.println(sb.hashCode());
		StringBuilder sd=new StringBuilder("Suresh");
		System.out.println(sd.hashCode());
		StringBuffer sb1=new StringBuffer("Rajesh");
		System.out.println(sb1.hashCode());
		sb.append(sd);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append(sb1);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		
		
		
		
		
	}

}
