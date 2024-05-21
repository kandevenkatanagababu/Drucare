package tasks;

interface Demo
{
	public default void m1()
	{
		System.out.println("Java 8 default interface");
		
	}
	public static void m2()
	{
		System.out.println("Static method");
	}
}
class Method implements Demo
{
	
}
public class DefaultInterface1Java8
{
	public static void main(String[] args) 
	{
		Method m=new Method();
		m.m1();
		Demo.m2();
	}
}


