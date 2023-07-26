class demo extends Thread
{
    public void run()
    {
        System.out.println("php");
        System.out.println("cpp");
    }
    public static void main(String arrgs[])
    {
        demo x=new demo();
        x.start();
        System.out.println("ds");
        System.out.println("vb");
        
    }
}