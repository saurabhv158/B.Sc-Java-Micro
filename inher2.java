import java.util.*;
class A
{
	private int i,j;
	void show ()
	{
		System.out.println("you entered " +(i+ " " +j));
	}
	void set(int x,int y)
	{
		i=x;
		j=y;
	}
}
		
class B extends A
{
	int k ;
	void display()
	{
		System.out.println(i+j);
	}
}
class inher2
{
	public static void main(String args[])
	{
		A obj1=new A();
		B obj=new B();
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 values");
		int x=s.nextInt();
		int y=s.nextInt();
		
		obj.set(x,y);
		//obj.k=50;
		//obj1.show();
		obj.show();
		obj.display();
	}
}