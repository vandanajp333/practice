
public class StringReverse {

	public static void main(String[] args) {

		String str = "palindrome";
		String temp="";
		for(int i=str.length()-1;i>=0;i--){
			
			System.out.print(str.charAt(i));
			temp=temp+str.charAt(i);
		}
		System.out.println();
		System.out.println(temp);
		if(str==temp)
			System.out.println("not");
		else System.out.println("pali");
		System.out.println(str+ " " +temp);
	}

}
