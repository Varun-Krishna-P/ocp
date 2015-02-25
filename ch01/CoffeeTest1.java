package ch01;
//import ch01.CoffeeEnum;
class Coffee{
	CoffeeSize size;
}
public class CoffeeTest1{
	public static void main(String args[]){
		Coffee coffee = new Coffee();
		coffee.size = CoffeeSize.BIG;
		System.out.println("Coffee Size: "+coffee.size);
		
	}
}