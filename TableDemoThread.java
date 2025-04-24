class TableDemoThread extends Thread
{
    int number; 
    TableDemoThread(String name,int number)
    {
        super(name);
        this.number=number;
    }
    public void run()
    {
        System.out.println("table of"+getName());
        for(int i=1;i<=10;i++)
        {
            System.out.println(number +"*" + i +"=" + number*i)
        }
    }
}