//to sum digits of a number
import java.util.*;
class dsum
{
	public static void main(String args[])
	{
		int num,sum=0,d;
		System.out.println("enter a number");
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
		while(num>0)
		{
			d=num%10;
			sum=sum+d;
			num=num/10;
		}
		System.out.println("sum of digits: "+sum);
	}
} 