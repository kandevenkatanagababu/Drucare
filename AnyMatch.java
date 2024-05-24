package practiceSection;

import java.util.stream.Stream;

public class AnyMatch
{
	public static void main(String[] args)
	{
		Stream <String> names=Stream.of("Naga","babu","VYshu");
		
		//all Match
		 boolean result=names.anyMatch(n->Character.isLowerCase(n.charAt(1)));
		
		 System.out.println(result);
		
		
	}

}
