import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {

		ArrayList<Integer>	al = new ArrayList<Integer>();
		al.add(1);
		al.add(0,5);
		System.out.println(al);
		System.out.println(al.get(1));
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Hello");
		al2.add(0,"there");
		System.out.println(al2.size());
		System.out.println(al2.contains("dd"));
		al2.add("hello");
		System.out.println(al2);
		System.out.println("Index of hello is "+al2.indexOf("there"));//has indexof method
		//al2.remove(3);
		
	}

}
