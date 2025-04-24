class TestThreadDemo
{
    public static void main(String args[])
    {
        ThreadDemo t1=new ThreadDemo();
        t2.start();
        t2.join();
        ThreadDemo t2=new ThreadDemo();
        t2.start();
        t2.join();
        ThreadDemo t3=new ThreadDemo();
        t3.start();
        t3.join();
    }
}