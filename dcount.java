//to count digits of a number
import java.util.*;
class dcount
{
	public static void main(String args[])
	{
		int num,count=0;
		System.out.println("enter a number");
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
		while(num>0)
		{
			num=num/10;
			count=count+1;
		}
		System.out.println("no. of digits: "+count);
	}
}