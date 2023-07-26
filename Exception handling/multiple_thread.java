
import java.util.*;
class amit extends Thread
{
    Thread d;
    amit(String a)
    {
       
        d=new Thread(this,a);
        System.out.println(d);
        d.start();

    }
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            
        }
    }
}
public class multiple_thread  {
    public static void main(String[] args) throws InterruptedException {
    new amit("one");
    new amit("Two");

    for (int i = 0; i < 5; i++) {
        System.out.println("main: "+i);
        Thread.sleep(1000);

        
    }


    }

   
    
}
