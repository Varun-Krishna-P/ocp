public class IntegerCmp{
	public static void main(String [] dummy){
		Integer i = 10;
		Integer j = 11;
		Integer k = ++i;
		System.out.println("K == i ?" + (k == i));
		System.out.println("k.equals(j): "+k.equals(j));
	}
}