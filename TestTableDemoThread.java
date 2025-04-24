class TestTableDemoThread
{
    public static void main(String args[])
    {
        TableDemoThread five=new TabledemoThread("Five",5);
        five.start();
        five.join();
        TableDemoThread six=new TableDemoThread("six",6);
        six.start();
        six.join();
        TableDemoThread seven=new TableDemoThread("seven",7);
        seven.start();
        
    }
}