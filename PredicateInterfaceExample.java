package tasks;

import java.util.function.Predicate;

public class PredicateInterfaceExample 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> pr=mark->(mark>50);
		System.out.println(pr.test(51));
		
	}

}
