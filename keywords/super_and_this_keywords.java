//super and this keywords
import java.util.*;
class demo
{
    demo(int a)
    {
        System.out.println("mrudula");
    }

}
class test extends demo
{
    void show()
    {
        System.out.println("priti");
    }
    test()
    {
        super(7);
        System.out.println("krutika");

    }

}
class good
{
    public static void main(String args[])
    {
        test x=new test();
        x.show();
    }
}
