import java.util.Scanner;
class NextPalindrome
{
   
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        num=sc.nextInt();

        int digit;
        int temp=num;
        int reversed=0;

        while(temp>0)
        {
            digit=temp%10;
            reversed=reversed*10+digit;
            temp/=10;

        }
        if(reversed==num)
        System.out.println("Palindrome Number");
        else{
             System.out.println(" Not a Palindrome Number");
             
        }
       
    }
}