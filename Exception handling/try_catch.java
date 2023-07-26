class Demo
{
    public static void main(String args[])
    {
        int a=0,b=3,c;
        System.out.println("JAVA");
        try
        {
            c=b/a;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("error");
        }
        System.out.println("cpp");
        System.out.println("python");
    }
}