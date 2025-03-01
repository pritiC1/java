import java.util.*;
class Calculate
{
    int a,b,c;
    
    Scanner sc=new Scanner(System.in) ;
    Calculate()
    {
        System.out.println("enter the number:");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void CaluculateAddition()
    {
        c=a+b;
        System.out.println("Addidtion of"+a+"and"+b+"is"+c);
    }
    void Calculatesubstraction()
    {
        if(a>b)
        {
            c=a-b;
            System.out.println("Substrction of "+a+" and "+b+" is "+c);
        }
        else
            c=b-a;
            System.out.println("substraction of "+b+" and "+ a +" is "+c);
    }
    
}