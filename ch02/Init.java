package ch02;public class Init{	Init(int x){		System.out.println("1 argument Constructor");			}	Init(){		System.out.println("0 argument constructor");			}	static {System.out.println("1st static initialization block");}	{System.out.println("1st Instance inintialization block");}	{System.out.println("2nd Instance initialization block");}	static{System.out.println("2nd static initialization block");}	public static void main(String[] args) {		new Init();		new Init(10);	}}