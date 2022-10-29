abstract class figure
{
	double d1,d2;
	
	figure(double a ,double b)
	{
		d1=a;
		d2=b;
	}
	abstract double area();
}
class rect extends figure
{
	rect(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		return d1*d2;
	}
}
class tri extends figure
{
	tri(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		return 0.5*d1*d2;
	}
}

class abscall
{
	public static void main(String args[])
	{
		rect r=new rect(5,8);
		System.out.println("area of rect= "+r.area());
		tri t=new tri(8,12);
		System.out.println("area of tri= "+t.area());
		
	}
}