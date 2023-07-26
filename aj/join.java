class demo implements Runnable
{
    public void run()
    {
        System.out.println("php");
    try{
        Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
        System.out.println("e");
    }
    System.out.println("cpp");
    }
}


    public static void main(String args[]) throws InterruptedException;

    {
        demo x=new demo();
        Thread y=new Thread(x);
        System.out.println("y.isAlive()");
        y.start();
        System.out.println("y.isAlive()");
        y.join();
        System.out.println(y.isAlive());
    }

    

