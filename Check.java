import java.util.*;
class Check
{
int num;
int i;
Scanner sc=new Scanner(System.in); 


Check()
{
    System.out.println("enter the number:");
    num=sc.nextInt();
}
void checkPalindrome()
{
    int original=num;
    int temp=num;
    int reversed=0;
    while(temp>0)
    {
        int digit=temp%10;
        reversed=reversed*10+digit;
        temp/=10;
        if(original==reversed)
        {
            System.out.println(num+"is palindrome");
        }
        else{
            System.out.println(num+"is not palindrome");
            break;
        }
    }
    
     sc.close();
}
void checkPrime()
{

int flag=0;
for(i=2;i<num;i++)
{
    if(num%i==0)
    {
       flag=1;
       break;         
    }
    if(flag==1)
    {
        System.out.println("not prime");
    
    }
    else
    {
        System.out.println("prime number");
    }
}
}
void checkOddEven()
{
    if(num%2==0)
        System.out.println("even number");
    else
        System.out.println("odd number");

}
}