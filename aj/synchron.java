import java.util.*;
 class synchron implements Runnable
 {
     public void run()
     {
         System.out.println("asd");
         synchronized(this)
         {
             try
             {
                 Thread d=Thread.currentThread();
                 String e=d.getName();
                 if (e.equals('c'))
                {
                        
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(i);
                        Thread.sleep(200);
                    }
                }
            }
            catch(InterruptedException v)
            {
                System.out.println(v);
            }

         }

     }
     public static void main(String[] args) {
         main p=new main();
         Thread x=new Thread(p);
         Thread y=new Thread(p);
         Thread z=new Thread(p);
         x.setName("a");
         y.setName("b");
         z.setName("c");
         x.start();
         y.start();
         z.start();
     }
 }