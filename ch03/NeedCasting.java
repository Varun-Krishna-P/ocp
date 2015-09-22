package ch03;
// this program explains the need for casting
class NeedCasting{
	public static void main(String[] args) {
		int x = (int)3957.229;
		System.out.println("The value of x is: "+x);
		long l = 56L;
		byte b = (byte)l;
		System.out.println("The value of byte b is: "+b);
		long l1 = 130L;
		byte b1 = (byte)l1;
		System.out.println("The value of byte b1 is: "+b1);
		
		
		
	}
}