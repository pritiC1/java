import java.util.*;
import java.net.*;
import java.io.*;
class Client
{
    public static void main(String[] args)throws Exception
    {
        Socket s=new Socket("localhost",3201);
        Scanner sc=new Scanner(System.in);
        String s2;
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        DataInputStream din=new DataInputStream(s.getInputStream());
        do{
        String s1=sc.nextLine();
        dout.writeUTF(s1);
        s2=din.readUTF();
        System.out.println("Server says "+s2);
        }while(!s2.equalsIgnoreCase("STOP"));
    }
}