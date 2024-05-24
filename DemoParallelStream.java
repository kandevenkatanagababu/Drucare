package practiceSection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoParallelStream 
{
	public static void main(String[] args)
	{
		//parallelStream
		List<String> name=Arrays.asList("Naga","Babu","Venkat");
		
		name.parallelStream()
		.forEach(nopredict->System.out.println(nopredict + " "+Thread.currentThread().getName()));
		
		//Sequally
		
		name.stream().forEach(sequal->System.out.println(sequal));
		
	}

}
