import java.util.*;
class MyException extends Exception
{
	int a;
	MyException(int x)
	{
		a=x;
	}
	public String tostring()
	{
		return "my exception with value "+a;
	}
	class mytry 
	{
		void compute(int a) throws MyException
		{
			System.out.println("inside compute method");
			if(a>10)
			{
				throw new MyException(a);
			}
			System.out.println("value of a "+a);
		}
	}
}

class callthrow
{
	public static void main(String args [])
	{
		mytry ob=new mytry();
		try
		{
			ob.compute(5);
			ob.compute(15);
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}