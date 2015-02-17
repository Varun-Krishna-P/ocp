package ch01.notcert;
import ch01.certification.ProtectedParent;
class Child extends ProtectedParent {
	public void testIt(){
		System.out.println("X is: "+x);
		
	}
	public static void main(String args[]){
		Child child = new Child();
		child.testIt();
	}
}