package tasks;

import java.util.ArrayList;

public class LamdaExerciseForEach
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(30);
		list.add(25);
		list.add(45);
		list.forEach( (n)->System.out.println(n));
		
	}

}
