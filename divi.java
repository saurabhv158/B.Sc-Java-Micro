import java.util.*;
class divi
{
	public static void main(String args[])
	{
		int i=0,q,rem;
		while(i>=0)
		{
			System.out.println("enter dividend ");
			Scanner s=new Scanner(System.in);
			int dd=s.nextInt();
			System.out.println("enter divisor");
			int dv=s.nextInt();
			try
			{
			rem=dd%dv;
			System.out.println("remainder is "+ rem);
			q=dd/dv;
			System.out.println("quotient is "+ q);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.print("continue? press 1/0 ");
			i=s.nextInt();
			
		}
	}
}
