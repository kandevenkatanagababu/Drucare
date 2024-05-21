package tasks;

interface Sample
{
	public default void m1()
	{
		System.out.println("Java 8 default interface");
		
	}
}
class Main implements Sample
{
	
}
public class DefaultInterfaceJava8
{
	public static void main(String[] args) 
	{
		Main m=new Main();
		m.m1();
		
	}

}
