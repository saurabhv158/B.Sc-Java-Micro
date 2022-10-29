import java.util.*;
class box
{
	int l ,  b ,  h ;
	void vol()
	{
		int v=l*b*h;
		System.out.println("volume is "+v);
	}
}
class voluser
{
	public static void main(String args[])
	{
		box obj=new box();
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 values");
		obj.l=s.nextInt();
		obj.b=s.nextInt();
		obj.h=s.nextInt();
		obj.vol();
	}
}
