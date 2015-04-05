package ch02;
class Animal {
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
		
	}
}
class Horse extends Animal{
	private void eat() {
		System.out.println("Horse eating hay, oats, and horse treats");
		
	}
}
public class TestAnimals2 {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Horse();
		a.eat();
		b.eat();
	}
}
/*
$ javac ch02/TestAnimals2.java
ch02\TestAnimals2.java:9: error: eat() in Horse cannot override eat() in Animal
		private void eat() {
					 ^
  attempting to assign weaker access privileges; was public
1 error
*/