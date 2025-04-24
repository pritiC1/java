import java.util.*;
class Operation
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string a:");
    String a=sc.nextLine();
    System.out.println("Enter the string b:");
    String b=sc.nextLine();
    System.out.println("Concatination of string: "+a.concat(b));
    System.out.println("Enter the string for reverse operation:");
    String s1=sc.nextLine();
    System.out.println("Original String= "+s1);
    String reverse=" ";
    int len=s1.length();
    for(i=len-1;i>=0;i--)
    {
        reverse=reverse+s1.CharAt(i);
    }
    }
    System.out.println("Reversed String:"+reverse);
    
}