import java.util.*;
 class sy implements Runnable
 {
     public void run()
     {
     //   synchronized(this)
     //   {
             try
             {
                 Thread d=Thread.currentThread();
                 String e=d.getName();
                System.out.println(d);
                // String b="amit";
                 if (e.equals("amit"))
                {
                  //  System.out.print("hii");
                        
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(i);
                        Thread.sleep(200);
                    }
                }
                else
                {
                    System.out.print("123");
                }
            }
            catch(InterruptedException v)
            {
                System.out.println(v);
            }

        //}

     }
     public static void main(String[] args) {
        sy p=new sy();
         Thread x=new Thread(p);
         Thread y=new Thread(p);
         Thread z=new Thread(p);
         x.setName("a");
         y.setName("amit");
         z.setName("c");
         x.setPriority(1);
         y.setPriority(2);
         x.start();
         y.start();
         z.start();
     }
 }