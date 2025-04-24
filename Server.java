import java.net.*;
import java.io.*;
import java.util.*;
class Server
{
    public static void main(String[] args)throws Exception
    {
        ServerSocket ss=new ServerSocket(3201);
        Scanner sc=new Scanner(System.in);
        System.out.println("Waiting for client request(Listening)");
        Socket s=ss.accept();
        String s1;
        System.out.println("Client connected.....");
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        do{
        s1=din.readUTF();
        System.out.println("Client says "+s1);
        String s2=sc.nextLine();
        dout.writeUTF(s2);
        }while(!s1.equalsIgnoreCase("STOP"));
    }
}