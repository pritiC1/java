import java.util.*;

class TestStringOperation
{
    public static void main(String args[])
    {
        StringOperation sc=new StringOperation();
        String result=sc.concatString("SKN","SCOE");
        System.out.println("Coancatination of string:"+result);
        result=sc.reverseString("SKN SCOE");
        System.out.println("Reversed String:"+result);
        result=sc.deleteCharAtLocation("SKN SCOE",0);
        System.out.println("String after deleting character at given location:"+result);
        result=sc.alternateCharacter("SKNSCOEPANDHARPUR");
        System.out.println("String after altering character operation:"+ result);

    }
}