class Demo implements Runnable
{
    public void run()
    {
        System.out.println("php");
        try
        {
            Thread.sleep(4000);
        }
        catch(InterruptedException e)
        {
            System.out.println("e");
        }
        System.out.println("cpp");
    }
    public static void main(String args[])throws InterruptedException
    {
        Demo x=new Demo();
        Thread y=new Thread(x);
        System.out.println(y.isAlive());
        y.start();
        System.out.println(y.isAlive());
        y.join();
        System.out.println(y.isAlive());

    }
}