package seleniumclasscoding;

public class assignment88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1=new StringBuilder("Tanusree");
		System.out.println(s1.append(" Saha"));
		System.out.println(s1.insert(13," student"));
		System.out.println(s1.delete(13,21));
		System.out.println(s1.substring(1));
		System.out.println(s1.reverse());
		System.out.println(s1.capacity());
		
		StringBuffer s2=new StringBuffer("suprita");

		System.out.println(s2.replace(1, 3, "tanu"));

	}

}
