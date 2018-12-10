import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapEg {

	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		System.out.println(hm.get(1));
		System.out.println(hm.containsKey(4));
		hm.replace(1, "two");
		System.out.println("Size is "+hm.size());
		System.out.println(hm.get(1));
		Set<?> set=hm.entrySet();
		Iterator<?> i = set.iterator();
		while(i.hasNext()){
			@SuppressWarnings("rawtypes")
			Map.Entry mp = (Map.Entry)i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		System.out.println("New Size is "+hm.size());
	}

}


