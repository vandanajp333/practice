import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("one");
		System.out.println(hs);
		System.out.println("size is "+hs.size());//no indexof method as no guarantee on arrangement
		System.out.println(hs.isEmpty());
	}

}
