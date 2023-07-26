import java.util.*;
class my
{
    public static void main(String args[])
    {
        try
        {
           throw new InterruptedException();
        }
        catch(InterruptedException e)
        {
             System.out.println("hellow world");
        }
        
    }
}