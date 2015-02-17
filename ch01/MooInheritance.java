package ch01;
class MooInheritance extends Zoo{
	public static void main(String[] args) {
		MooInheritance m = new MooInheritance();
		m.useMyCoolMethod();
	}
	public void useMyCoolMethod(){
		System.out.println("Moo Says: "+this.coolMethod());
		Zoo z = new Zoo();
		System.out.println("Zoo Says: "+ z.coolMethod());
		
		
	}
}