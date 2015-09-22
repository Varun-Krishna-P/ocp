public class StringCmp{
	public static void main(String dummy[]){
		String s1= "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		if(s1 == s2) System.out.println("s1 and s2 are equal");
		else System.out.println("They aren't equal");

		if(s1 == s3) System.out.println("s1 and s3 are equal");
		else System.out.println("They aren't equal");

		if(s1.equals(s2)) System.out.println("s1.equals(s2): "+s1.equals(s2));
		else System.out.println("s1.equals(s2): "+s1.equals(s2));
	}
}