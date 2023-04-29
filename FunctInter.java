import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public interface FunctInter {
	
	//void calculate(int x);
	
	//int calculate(int x);

	public static void main(String[] args) {
		
//		FunctInter x=(int y)->System.out.println( y * y * y);
//		FunctInter c=(int z)->System.out.println(z * z);
//		x.calculate(5);
//		c.calculate(6);
		
//		FunctInter x=(int y)->y*y;
//		int calculate = x.calculate(5);
//		System.out.println(calculate);
		
		Consumer<Integer> fun=(number)->System.out.println(number);
		fun.accept(20);
		
		Supplier<String> str=()->"I am Suresh";
		String print = str.get();
		System.out.println(print);
		
		Predicate<Integer> p=(num)->num==0;
		
		System.out.println(p.test(0));	
		
		Function<Integer, Integer> f=(number)->number*2;
		Integer a = f.apply(20);
		System.out.println(a);
		
		List<Integer> asList = Arrays.asList(2,4,1,2,1,4,4,3,5);
		asList.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("----------");
		asList.stream().limit(5).distinct().filter(x-> (x==2)).forEach(System.out::println);
		
		System.out.println("-----");
		List<List<Integer>> asList2 = Arrays.asList(Arrays.asList(1,2,3,5),Arrays.asList(6,7,8,9));
		System.out.println(asList2);
		System.out.println("------------");
		asList2.stream().flatMap(List::stream).forEach(System.out::println);	
		asList2.stream().flatMap(List::stream).forEach(System.out::println);
	}
}

