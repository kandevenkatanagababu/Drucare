package tasks;

import java.util.ArrayList;

public class CollectionDemo
{
	public static void main(String[] args)
	{
		//initilaze
		ArrayList list=new ArrayList<>();
		list.add("Mango");
		list.add("Apple");
		list.add("bananna");
		list.add(null);
		System.out.println("ArrayList is "+list);
		int length=list.size();
		System.out.println("length of an arraylist "+length);
		
		ArrayList food=new ArrayList<>();
		food.add("Mutton briyani");
		food.add("chicken briyani");
		food.add("Meals");
		//concate of two lists
		list.addAll(2, food);
		System.out.println("concate of two lists "+list);
		//element exists are not?
		if(list.contains("Pizza"))
		{
			System.out.println("Pizza is present in arrayList");
		}
		else
		{
			System.out.println("Not present in an arrayList");
		}
		//for each loop
		for (Object items : list) 
		{
			System.out.println(items);
			
		}
		//adding an element based on element
		list.add(4, "Ice cream");
		System.out.println(list);
		
		//remove an element
		food.remove(2);
		System.out.println(food);
	}

}
