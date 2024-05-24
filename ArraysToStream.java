package practiceSection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class ArraysToStream
{
	public static void main(String[] args) 
	{
		//method 1 -> if u have array, call Arrays.stream() to convert array to streams
		
		Integer[] num= {3,4,5,6,8};
		Arrays.stream(num).forEach(n->System.out.println(n));
		
		// method 2 -> if u have list collection -,stream(), parallelSteam()
		
		List<Integer> dataList= Arrays.asList(num);
		
		// converting list to stream, using stream()
		
		dataList.stream().forEach(x->System.out.println(x));
		
		// converting list to stream, using parallelstream()
		dataList.parallelStream().forEach(s->System.out.println(s));
		
		//method 3 
		//if u wanna directly convert numbers to stream without referring array or list 
		
		Stream.of(99,66,59).forEach(x->System.out.println(x));
	}
}
