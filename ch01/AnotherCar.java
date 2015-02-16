// Demonstrates the Abstract class can't be instantiated
package ch01;

abstract class Car{
	private double price;
	private String model;
	private String year;
	public abstract void goFast();
	public abstract void goUpHill();
	public abstract void impressNeighbours();
}
public class AnotherCar{
	public static void main(String[] args) {
		Car abstractCar = new Car();
	}
}
/*
ch01\AnotherCar.java:14: error: Car is abstract; cannot be instantiated
				Car abstractCar = new Car();
								  ^
1 error
*/