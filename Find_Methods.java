package practiceSection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Find_Methods 
{
	public static void main(String[] args)
	{
		List<String> name=Arrays.asList("Babu","sUresh","bHavani");
		
		Optional<String> result=name.stream().filter(find->Character.isUpperCase(find.charAt(1)))
				.sorted()
				.findAny();

		System.out.println(result.get());
				
				
		
	}

}
