package ch02;
public class TestAdder{
	public static void main(String[] args) {
		Adder adder = new Adder();
		int number1 = 27;
		int number2 = 47;
		int sum = adder.addThem(number1, number2);
		System.out.println("The sum of the ints is: "+sum);		
		double doubleSum = adder.addThem(56.66, 67.5);
		System.out.println("The sum of the double number's is: "+doubleSum);
		
	}
}