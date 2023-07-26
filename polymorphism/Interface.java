//interface
import java.util.*;
interface Demo
{
    void one();
    void two();

}
class Test implements Demo
{
    public void one()
    {
        System.out.println("Mrudula");

    }
    public void two()
    {
        System.out.println("shinde");

    }
}
class interfaceSample
{
    public static void main(String args[])
    {
        Demo x=new Test();
        x.one();
        x.two();
    }
}