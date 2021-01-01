import java.net.*;
import java.io.*;
import java.util.Scanner;
public class ClientPgm
{
 public static void main(String args[])throws Exception
 {
   Socket s=new Socket("localhost",6666);
   DataOutputStream dos=new DataOutputStream(s.getOutputStream());
Scanner scan=new Scanner(System.in);
System.out.println("Enter your Message:");
String msg=scan.next();
 dos.writeUTF(msg);
 dos.flush(); 
 dos.close();
 s.close();
 }
}