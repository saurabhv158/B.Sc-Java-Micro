class strbu
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("hello");
		StringBuffer sb=new StringBuffer("jibberish");
		System.out.println(sb);
		sb.append("world");
		System.out.println(sb);
		String s="30";
		sb.append(s);
		System.out.println(sb);
		System.out.println("length="+sb.length());
		System.out.println("capacity="+sb.capacity());
		sb.insert(6,"how are you");
		System.out.println(sb);
		sb.insert(6,sb2);
		System.out.println(sb);
	}
}