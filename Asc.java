import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Asc {
	String name;
	int age;

	public Asc(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		List<String> asc = new LinkedList<>();
		asc.add("Hi");
		asc.add("Arun");
		asc.add("Ajay");
		asc.add("Welcom");
		asc.add("Raju");

		Collections.sort(asc);
		System.out.println(asc);
		Collections.sort(asc, Collections.reverseOrder());
		System.out.println(asc);

		Asc a = new Asc("Dravid", 44);

		Asc a1 = new Asc("Dhoni", 38);

		Asc a2 = new Asc("Virat", 33);

		Asc a3 = new Asc("Jadeja", 34);

		List<Asc> as = new LinkedList<>();
		as.add(a);
		as.add(a1);
		as.add(a2);
		as.add(a3);

		for(Asc c:as) {
		System.out.println(c.getName()+" "+c.getAge() );
		}
		System.out.println("----------------------");
		List<Asc> collect = as.stream().sorted(Comparator.comparing(Asc::getAge).reversed()).collect(Collectors.toList());
		for (Asc c : collect) {
			System.out.println(c.getName() + " " + c.getAge());
		}
		System.out.println("lamda");
	
		//List<Asc> collect = as.stream().sorted(Comparator.comparing(Asc::getAge).reversed()).collect(Collectors.toList());
		List<Integer> asList = Arrays.asList(5,2,4,3,1,1);

		System.out.println(asList);
		
		Set<Integer> set= new LinkedHashSet<>(asList);
		System.out.println(set);
		
		Optional<Integer> findFirst = asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		if(findFirst.isPresent()) {
		System.out.println(findFirst.get());
		}
		else {
			System.out.println("There is no second number");
		}
		System.out.println("Code Added");
		System.out.println("Code Added");
		System.out.println("Code Added");
		System.out.println("Code Added");
	}

}
