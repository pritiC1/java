import java.util.*;
class BankAccount
{
    String name;
    String accountNumber;
    String type;
    double balance;

    BankAccount()
    {
        Scanner sc=new Scanner (System.in);
        String name=sc.nextLine();
        String accountNumber=sc.nextLine();
        String type=sc.nextLine();
        double balance=sc.nextDouble();
    }

    void initializeAccount(String name,String accountNumber,String type,String balance)
    {
        name=accountName;
        accountNumber=accNumber;
        type=accountType;
        balance=accountBalance;

    }
    void deposite()
    {
        System.out.println("Enter deposite amount");
        amount=sc.nextInt();
        if (amount>0)
        {
            deposite+=amount;
            System.out.println(" RS. "+deposite+"deposited Successfully");
        }
        else{
            System.out.println("invalid deposit amount");
        }

    }
    void Withdraw()
    {
        System.out.println("Enter withdraw amount");
        amount=sc.nextInt();

        if(amount>0 && amount<balance)
        {
            balance-=amount;
            System.out.println( " RS. "+balance+" amount withdrew successfully");
        }

    }
    void Display()
    {
        System.out.println("account holder "+name);
        System.out.println("account balance "+balance);
    }
}