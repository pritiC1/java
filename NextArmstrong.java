import java.util.Scanner;
class NextArmstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        new=sc.nextInt();

        int copy=num;
        int arm,rem;
        while(num>0)
        {
            rem=num%10;
            arm=arm+(rem*rem*rem); 
            num=num/10;
        }
        if(arm==copy)
        {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("not Armstrong number");
            for(i=copy;i>0;i++)
            {
                num=i;
                arm=0;
                while(num>0)
                {
                    
                }
            }
        }
    }
}