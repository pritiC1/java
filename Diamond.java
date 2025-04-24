import java.util.Scanner;
class Diamond
{
    public static void main(String[] args)
    {
        int i,j;
        int row,space;
        Scanner sc=new Scanner(System.in);
        
        do
        {
            System.out.println("Enter the odd number");
            row=sc.nextInt();
            if(row%2==0)
            {
                System.out.println("enter odd number for row");
            }
        }while(row%2==0);
        for(i=1;i<(row/2)+1;i++){
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }

            for(j=1;j<(row/2-i)+1;j++)
            {
                System.out.print("");
            }
            
            
        }
        for(i=1;i<(row/2)+1;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.println("");
            }
            for(j=1;j<=(row/2-i)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}