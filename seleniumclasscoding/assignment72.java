package seleniumclasscoding;

public class assignment72 {

	public static void main(String[] args) {

		String s = "madam";
		String r = "";
		char ch;

		for (int i = 0; i < s.length(); i++) {

			// extracts each character
			ch = s.charAt(i);

			// adds each character in
			// front of the existing string
			r = ch + r;
			// int a=10/0;
		}

		System.out.println(r);
		boolean b = s.equals(r);
		
		if (b == true) {
			System.out.println("true");

		}
		else 
		{
			System.out.println("false");

		}
	}

}
