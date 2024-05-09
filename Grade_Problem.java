package tasks;

public class Grade_Problem
{
	public static void main(String[] args) 
	{
		char firstClass='A';
		char secondClass='B';
		char thirdClass='C';
		char fourthClass='D';
		char fail='F';
		switch (secondClass) 
		{
		case 'A':case 'a':
		System.out.println("Good or above 90%");
		break;
		case 'B': case 'b':System.out.println(" above 80%");
		break;
		case 'C':case 'c':System.out.println(" above 70%");
		break;
		case 'D':case 'd': System.out.println(" above 60%");
		break;
		case 'F':case 'f': System.out.println(" failed");
		break;
		default:System.out.println("please enter vaild grade");
			break;
		}
		
	}

}
