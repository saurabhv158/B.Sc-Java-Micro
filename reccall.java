import java.util.Scanner;
class recursion
{
	int recfacto(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*recfacto(n-1);
		}
	}
}

class reccall
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		recursion obj=new recursion();
		System.out.println("factorial: "+obj.recfacto(num));
	}
}


		