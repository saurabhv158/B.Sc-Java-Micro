import java.util.*;
class A
{
	int i,j;
	void show ()
	{
		System.out.println("you entered " +(i+ " " +j));
	}
		
}
class B extends A
{
	int k ;
	void display()
	{
		System.out.println(" whose sum is: " +(i+j));
	}
}
class inher
{
	public static void main(String args[])
	{
		B obj=new B();
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 values");
		obj.i=s.nextInt();
		obj.j=s.nextInt();
		obj.show();
		obj.display();
	}
}