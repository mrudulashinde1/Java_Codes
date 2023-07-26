import java.util.*;

class Demo
{
    int a,b;
    void one()
    {

    }
}
class Test extends Demo
{
    float c;
    void two()
    {
        c=4.5F;
    }
}
class Sample
{
    public static void main(String args[])
    {
        Test x=new Test();
        x.c=3.5F;
        x.two();
        x.a=11;
        x.b=21;
        x.one();
        Demo y=new Demo();
        y.a=11;
        y.b=21;
        y.one();
    }
}