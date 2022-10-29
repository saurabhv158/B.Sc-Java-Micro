class exhand
{
	public static void main(String args[])
	{
		int a,b,c;
		int m[]=new int[5];
		for(int i=0;i<5;i++)
		{
			try
			{
				a=i+2;
				b=i;
				c=a/b;
				m[a]=b+c;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
	}
} 
