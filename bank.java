class bankaccount
{
	int custid;
	String name;
	double bal;
	void getbal()
	{
		System.out.println("balance is "+bal);
	}
	bankaccount()
	{
		System.out.println("initial balance :"+bal);
		bal=10000;
	}
	void setdetails(int x,String s)
	{
		custid=x;
		name=s;
		bal=10000;
	}
	void getdetails()
	{
		System.out.println("custid= "+custid);
		System.out.println("name= "+name);
		System.out.println("balance is = "+bal);
	}
}
class savingsaccount extends bankaccount
{
	double roi;
	void addinterest(int roi,int time)
	{
		double x=(roi*bal*time)/100;
		System.out.println("balance after interest added: "+bal);
		bal=bal+x;
	}
	void deposit(double amt)
	{
		System.out.println("new balance after deposit ");
		bal=bal+amt;
	}
	void withdraw(double amt)
	{	
		System.out.println("new bal after withdrawal ");
		bal=bal+amt;
	}
	void transfer(double amt,bankaccount obj)
	{
		System.out.println("bal after tranfer ");
		bal=bal-amt;
		System.out.println("balance left ");
		obj.bal=obj.bal+amt;
	}
}
class bank 
{
	public static void main(String args[])
	{
		savingsaccount b1=new savingsaccount();
		savingsaccount b2=new savingsaccount();
		b1.setdetails(12071,"Aakash");
		b2.setdetails(12010,"Chetna");
		b1.getdetails();
		b2.getdetails();
		b1.deposit(1000);
		b1.addinterest(5,2);
		b1.withdraw(7000);
		b1.transfer(2000,b2);
		b1.getdetails();
		b2.getdetails();
	}
}
		
	