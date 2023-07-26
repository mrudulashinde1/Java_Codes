import java.util.*;

import javax.lang.model.util.ElementScanner6;
class thread implements Runnable
{
public void run()
{
    Thread x=Thread.currentThread();
    try
    {
        
        String s=x.getName();
        if(s.equals("amit"))
        {
            for(int i=0;i<100;i++)
            {
                System.out.println(i);
                Thread.sleep(10);
            }
        }
        else if(s.equals("priti"))
        {
            for(int i=0;i<5;i++)
            {
            System.out.println("abcdefghijklmn");
            Thread.sleep(10);
            }
        }
        else
        {
            System.out.print("obj");
        }
    }
    catch(InterruptedException e)
    {
        System.out.print(e);
    }
}

 public static void main(String[] args) 
 {
    thread m=new thread();
    Thread p=Thread.currentThread();
   
    Thread y=new Thread(m);
    y.setName("amit");
  
   Thread l=new Thread(m);
    l.setName("priti");
    l.start();
    y.start();
   

   
}
}