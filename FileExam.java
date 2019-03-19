import java.io.*;
import java.util.*;
class FileExam
{
	public static void main(String args[])throws Exception
	{
		FileReader f1=new FileReader("123.txt");

		BufferedReader bf=new BufferedReader(f1);
		Scanner scan=new Scanner(System.in);
		System.out.println("enter text to be search");
		String text=scan.next();
		String t1="";
		boolean ch=false;
		while(bf.ready())
		{
		t1=bf.readLine();
		
			if(t1.equals(text))
			ch=true;
		}
			if(ch==true)
			System.out.println("found");
			else
			System.out.println("not found");	


	}
}