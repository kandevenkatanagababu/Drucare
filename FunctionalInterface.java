package tasks;

import java.util.function.Function;

public class FunctionalInterface
{
	public static void main(String[] args)
	{
		Function<String, Integer> functionDemo=name->name.length();
		System.out.println(functionDemo.apply("Venkat"));
		
	}

}
