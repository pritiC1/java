class ThreadDemo implements runnable
{
 public void run()
 {
    for(int i=1;i<=10;i++)
        {
            System.out.println(i+"*" + i +"=" + i*i);
        }
 }
}