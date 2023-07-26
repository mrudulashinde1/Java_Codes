class demo implements Runnable
{
    public void run()
    {
        System.out.println("php");
        System.out.println("cpp");
    }
    public static void  main(String args[])
    {
      demo x=new demo();
      Thread y=new Thread(x);
      y.start();
      System.out.println("ds");
      System.out.println("vb");  
    }
}
