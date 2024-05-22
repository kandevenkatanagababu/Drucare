package tasks;

import java.util.function.Consumer;

public class ConsumerInterfaceEx1
{
	static void name(String name)
	{
		System.out.println("Hello "  + name);
	}
	static void number(int number)
	{
		System.out.println(number);
	}
	public static void main(String[] args)
	{
		Consumer<String> name=ConsumerInterfaceEx1::name;
		name.accept("Sai");//Calling Consumer method
		
		Consumer<Integer> number=ConsumerInterfaceEx1::number;
		number.accept(250);
		
	}

}
