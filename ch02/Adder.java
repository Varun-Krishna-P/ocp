package ch02;
class Adder {
	public int addThem(int number1, int number2){
		return number1 + number2;
	}
	// Overload the addThem method to add doubles instead of ints.
	public double addThem(double number1, double number2){
		return number1 + number2;
	}
}