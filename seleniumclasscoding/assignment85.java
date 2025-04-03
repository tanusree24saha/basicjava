package seleniumclasscoding;

public class assignment85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Tanusree 78 @";

		System.out.println(s.replace('T', '2'));
		System.out.println(s.replaceAll("[A-Z0-9]", "2"));
		System.out.println(s.substring(s.length() - 4, s.length()));
		boolean b1 = s.matches("(.*)8(.*)");
		System.out.println(b1);
		System.out.println(s.repeat(3));
		

	}

}
