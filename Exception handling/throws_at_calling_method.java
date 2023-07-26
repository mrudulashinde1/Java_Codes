import java.util.*;
class best
{
    void one() throws InterruptedException
    {
        throw new InterruptedException();

    }
    void two() throws InterruptedException 
    {
        one();
    }
    void three()
    {
        try
        {
            two();
        } 
        catch(InterruptedException e)
        {
            System.out.println("e");
        }
       
    }
}
class test
{
    public static void main(String args[])
    {
        best x=new best();
        x.three();
    }
}
