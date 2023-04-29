import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>(Arrays.asList(10,10,30,20,40));
		System.out.println(list);
		Set<Integer> set=new LinkedHashSet<>(list);
		System.out.println(set);
		
		Collections.sort(list);
				System.out.println(list);
				Collections.sort(list,Collections.reverseOrder());
				System.out.println(list);
//		List<Integer> collect = list.stream().sorted(Comparator.comparing(list::)).collect(Collectors.toList());
//		System.out.println(collect);
//		
	}
}
