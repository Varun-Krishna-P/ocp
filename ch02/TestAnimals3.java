package ch02;
class Animal{
	private void eat() {
		System.out.println("Generic Animal Eating Generically");
		
	}
}

class Horse extends Animal{
	
}
public class TestAnimals3{
	public static void main(String[] args) {
		Horse h = new Horse();
		h.eat();
	}
}