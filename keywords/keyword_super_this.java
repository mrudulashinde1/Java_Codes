//super and this keyword
import java.util.*;
class demo
{
    demo()
    {
        System.out.println("php");
    }
    demo(int a)
    {
        this();
        System.out.println("cpp");

    }

}
class Test extends demo
{
    Test()
    {
        this(6.9F);
        System.out.println("vb");

    }
    Test(float a)
    {
        super(7);
        System.out.println("jsp");
    }
}
class Best
{
    public static void main(String args[])
    {
        Test x=new Test();
    }
}