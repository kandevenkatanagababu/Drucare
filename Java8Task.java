package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Task
{
	public static void main(String[] args) 
	{
		// try to print the count of the datas having length greater than 3 
        List<String> names = Arrays.asList("Sam", "Peter", "ballon", "Sam");
        
        long count = names.stream()
                          .filter(name -> name.length() > 3)
                          .count();
        
        System.out.println("Count of names with length greater than 3: " + count);
        
        //To uppercase
        List<String> modified =new ArrayList<String>();
        for (String s : names)
        {
        	modified.add(s.toUpperCase());
        }
		System.out.println(modified);
		
		
		// convert the  all te cities to uppercase
		List<String> cityList=Arrays.asList("chennai", "mumbai", "bangalore", "", "delhi", "chicago");
		System.out.println(cityList);
		
		List<String> upperCase=cityList.stream()
				//Using lamda experssion
					.map(n->n.toUpperCase())
				//method Reference
					.map(String::toUpperCase)
					.collect(Collectors.toList());
		System.out.println(upperCase);
		
		//filter te cities whose lengt is greater than 6
		
	long countOfCities=cityList.stream()
				.filter(l->l.length()>6)
				.count();
	System.out.println(countOfCities);
	//filter the cities that starts with c
	List<String> filter=cityList.stream()
	.filter(n->n.startsWith("c"))
	.collect(Collectors.toList());
	System.out.println(filter);
	
	//count how many cities start with c 
	
	long count1=cityList.stream()
			.filter(n->n.startsWith("c"))
			.count();
	System.out.println(count1);
	
	//print the cities that contains "ai"
	
	List<String> containsAi=cityList.stream()
			.filter(n->n.contains("ai"))
			.collect(Collectors.toList());
	System.out.println(containsAi);
	
	//append  the word "metro" to all the cities (hint: manipulation )
	List<String> append=cityList.stream()
			.map(metro-> metro + " metro")
			.collect(Collectors.toList());
	System.out.println(append);
	
	//ix) count the empty string  (hint:use terminal operation:count)
	
	long space=cityList.stream()
			.filter(s->s.isEmpty())
			.count();
	System.out.println(space);
	
	// remove all empty string from list
	        
	        List<String> noSpace = cityList.stream()
	                                                .filter(r -> !r.isEmpty())
	                                                .collect(Collectors.toList());
	        
	        System.out.println(noSpace);
	}
}
