package com.capgi.day3;

class A{
	
		public int a=10;
	public void printA(){
		System.out.println("I am class A");
	}
	
}
	class B extends A
	{
		public int b=20;
		public void printB()
		{
			System.out.println("I am class B");
		}
	}
public class Mysinglelevelinheritance {
public static void main(String args[])
{
	B b=new B();
	b.printB();
	b.printA();
	System.out.println("B belongs to A" +b.a);
	System.out.println("B belongs to B" +b.b);
	
}
}
