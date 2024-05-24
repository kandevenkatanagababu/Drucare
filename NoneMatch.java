package practiceSection;

import java.util.stream.Stream;

public class NoneMatch 
{
		public static void main(String[] args)
		{
			Stream <String> names=Stream.of("Naga","bAbu","VYshu");
			
			//all Match
			 boolean result=names.noneMatch(n->Character.isLowerCase(n.charAt(1)));
			
			 System.out.println(result);
			
			
		}
}
