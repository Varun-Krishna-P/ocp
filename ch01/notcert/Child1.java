package ch01.notcert;
import ch01.certification.Parent;
class Child1 extends Parent {
	public void testIt(){
		System.out.println("X is: "+x);
		
	}
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.testIt();
	}
}