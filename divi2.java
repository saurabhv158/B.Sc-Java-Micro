import java.util.*;
class divi2
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int i;
		System.out.println("enter 5 array elements");
		Scanner s=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		try
		{
			System.out.println("your array is ");
			try
			{
				for(i=1;i<=5;i++)
			}
		catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("going to next exception");
		a[54]=6;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		
	System.out.println("you may continue after exception");
	}
}
		