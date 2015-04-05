package ch02;
class Animal {
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
		
	}
	public void printYourself(){
		System.out.println("Print yourself method from Animal class....");
		
	}
}
class Horse extends Animal {
	public void printYourself(){
		super.printYourself();
		System.out.println("This is the print yourself method from Horse class.");
		
	}
}
public class TestAnimals4{
	public static void main(String[] args) {
		Horse horse = new Horse();
		horse.printYourself();
	}
}