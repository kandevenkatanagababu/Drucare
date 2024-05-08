package sample;

public class Pattern2 
{
	public static void main(String[] args) 
	{
		int space=0;
		int star=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(" "+"*"+"");
			}
			if(i<=3)
			{
				star=star-2;
				space--;
			}
			if(i==4 && i==5)
			{
				star=star+2;
				space++;
			}
			System.out.println();
			
		}
	}

}
