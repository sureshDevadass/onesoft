import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFas {

	public static void main(String[] args) {

		HashMap<Integer, String> mp = new HashMap<>();

		mp.put(101, "Suresh");
		mp.put(102, "Pranav");
		mp.put(103, "Ruthra");
		Set<Entry<Integer, String>> entrySet = mp.entrySet();

		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		while (itr.hasNext()) {

			Entry<Integer, String> next = itr.next();
			if (next.getKey() == 103) {

				itr.remove();

			}
			else {
				System.out.println(itr.next());
			}
		}

//		for (Entry<Integer, String> entry : entrySet) {
//			if (entry.getKey() == 101) {
//				mp.remove(entry.getKey());
//			}
//			else
//			{
//				System.out.println(entry);
//			}
//		}
//		System.out.println(mp);

	}

//		Iterator itr=mp.entrySet().iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		   //mp.put(104, "Mani");
//		}
//		ConcurrentHashMap<Integer,String> copy=new ConcurrentHashMap<>(mp);
//		
//		Iterator itr1=copy.keySet().iterator();
//		while(itr1.hasNext()) {
//			System.out.println(itr1.next());
//			 copy.put(104, "Mani");
//		}
//	}

}
