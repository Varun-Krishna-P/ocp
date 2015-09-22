package ch03;
public class BytesTest{
	public static void main(String[] args) {
		byte a = 3;
		byte b = 8;
		// if you don't cast the variable c as byte you will get the following error
		//ch03\BytesTest.java:13: error: possible loss of precision
		//byte c = a + b;
		//		   ^
		//required: byte
		//found:    int
		//1 error
		byte c = (byte)(a + b);
		System.out.println("The sum of the bytes is: "+c);
		
	}
}