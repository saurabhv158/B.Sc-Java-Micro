import java.io.*;
class FMH
{
	public static void main(String args[]) throws IOException
	{
		int i	;
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try
		{
			try
			{
				fin= new FileInputStream(args[0]);
			}
			catch(FileNotFoundException e)
			{
				System.out.println("file not found");
				return;
			}
			try
			{
				 fout=new FileOutputStream(args[1]);
			}
			catch(FileNotFoundException e)
			{
				System.out.println("error opening file");
				return;
			}
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			return;
		}
		try
		{
			do
			{
				i=fin.read();
				if(i!=-1)
				{
					fout.write(i);
				}
				
			}
			while(i!=-1);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			fin.close();
			fout.close();
		}
	}
}