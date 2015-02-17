package ch01;
import ch01.cert.Roo;
class Cloo extends Roo{
	public static void main(String[] args) {
		Cloo cl = new Cloo();
		cl.testCloo();
	}
	public void testCloo(){
		System.out.println("Testing Cloo: "+ doRooThings());
		
	}
}