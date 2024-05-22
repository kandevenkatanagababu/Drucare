package tasks;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaExerciseForEach2
{
	public static void main(String[] args) 
	{
		ArrayList<String> name=new ArrayList<String>();
		name.add("manoj kumar");
		name.add("chandu");
		name.add("Nagababu");
		Consumer<String> method=(n)->System.out.println(n);
		name.forEach(method);
		
		
	}

}
