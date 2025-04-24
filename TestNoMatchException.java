import java.util.*;
class TestNoMatchException
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string:");
    String str=sc.nextLine();
    try
    {
        if(str.equals("India"))
        System.out.println("String matched");
        else
        throw new NoMatchException("String is not matched");
    }
    catch(NoMatchException ae)
    {
        System.out.println("custom exception thrown");
        System.out.println(ae.getMessage());
    }

}
} 