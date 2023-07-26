import java.util.*;
abstract class Demo
{
    void one()
    {
        System.out.println("PHP");
    }
    void two()
    {
        System.out.println("VB");  
    }
    abstract void three();//declaraction
}
class Test extends Demo
{
    void three()
    {
        System.out.println("CPP");
    }
}
class Sample
{
    public static void main(String args[])
    {
        Demo x=new Test();
        x.one();
        x.two();
        x.three();
        
    }
}


