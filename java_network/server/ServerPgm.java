import java.net.*;
import java.io.*;
public class  ServerPgm
{
 public static void main(String args[])throws Exception
 {

 ServerSocket ss=new ServerSocket(6666);
 Socket s=ss.accept();
 DataInputStream dis=new DataInputStream(s.getInputStream());
 String fromClient=(String)dis.readUTF();
 System.out.println("data from client : "+fromClient); 
 ss.close();
 }
}
