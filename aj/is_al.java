import java.lang.*;
class is_al extends Thread
{
    public void run()
    {
        synchronized 
        String s=Thread.currentThread().getName();
        try 
        {
           
            for(int i=0;i<5;i++)
            {
                System.out.println(s);
                Thread.sleep(10);
            }
        } 
        catch(InterruptedException e) 
        {
            System.out.print(e);
        }
        finally
        {
            Thread d=currentThread();

            System.out.println(d);
            System.out.println(d.isAlive());

        }

    }


    public static void main(String[] args) 
    {
        is_al p=new is_al();
        Thread x=new Thread(p);
        Thread y=new Thread(p);
        Thread z=new Thread(p);
        x.setName("x");
        y.setName("y");
        z.setName("z");
        try
        {
            z.start();
            z.join();
        }
        catch(InterruptedException e)
        {       }
     

        y.start();
        try
        {
        x.start();
      //  x.suspend();
        x.wait(1000);
        //x.sleep(100);
        }
        catch(InterruptedException e)
        {
            
        }
      //  x.resume();
        
    }

}