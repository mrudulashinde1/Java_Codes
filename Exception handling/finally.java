import java.util.*;
class good
{
    public static void main(String args[])
    {
        int a=0,b=3,c;
        System.out.println("mrudula");
        try
        {
            c=b/a;
            System.out.println(c);

        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally block always called");

        }
        System.out.println("priti");
    }
}
