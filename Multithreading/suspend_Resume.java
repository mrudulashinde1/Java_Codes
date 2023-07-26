class Demo implements Runnable
{
    public void run()
    {
        System.out.println("php");
    }
    try
    {
        Thread.sleep(3000);
    }
    catch(InterruptedException e)
    {
        System.out.println("e");
    }
    System.out.println("jsp");
    static void main(String args[])
    {
        
    
        Demo x=new Demo();
        Thread y=new Thread(x);
        y.start();
        y.suspend();
        Thread.sleep(6000);
        y.resume();     
}
