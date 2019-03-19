import java.util.Scanner;
class IntegrException extends Exception
{
  	public IntegrException(int n)	
	{
		if(n>50)
		System.out.println(n+" Greater Than Exception"+System.nanoTime());
		else if(n<50)
		System.out.println(n+" Less than Exception"+System.currentTimeMillis());
		else
		System.out.println(" no more an exception");	
	}

}
class MyException
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	try
	{
	System.out.println("Enter the number:");
	int v=scan.nextInt();	
	throw new IntegrException(v);
	}
	catch(IntegrException e)	
	{
		System.out.println("user Exception Raised:");
	}
	finally
	{
		System.out.println("finished program");
	}

}
}
