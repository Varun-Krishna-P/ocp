package ch02;
class Animal{
	public void eat(){
		System.out.println("This is the general class for the Animal. When the animal is hungry it eats its food:)");
		
	}
}
class Horse extends Animal{
	public void eat(){
		System.out.println("This method especially belongs to the horse class. It eats grass, hay and whatever whenever it feels hungry");
		
	}

}
class Monkey extends Animal{
	public void eat(){
		System.out.println("This method especially belongs to the monkey class. It eats coconut, banana and whatever whenever it feels hungry");
		
	}
	void descMe(){
		System.out.println("The monkey's come in different colours and shapes. They can walk in two legs, they are intelligent creatures.");
		
	}
}
public class TestAnimal{
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		Animal a2 = new Horse();
		a2.eat();
		Animal a3 = new Monkey();
		a3.eat();
		//You can't call deseMe on Animal type because the Animal class doesn't have that method
		//a3.descMe();
		Monkey m = new Monkey();
		m.eat();
		m.descMe();
	}
}