import java.util.*;
class Demo
{
    void show()
    {
        System.out.println("PHP");
    }
    void disp()
    {
        System.out.println("vb");
    }
}
class Test extends Demo
{
    void show()
    {
        System.out.println("JAVA");
    }
    void view()
    {
        System.out.println("CPP");


    }
     
        
    
}
class fast
{
    public static void main(String args[])
    {
        Demo x=new Demo();
        x.show();
        x.disp();
        Demo y=new Test();
        y.show();
        y.disp();
        //y.view();...........compile time error 
    }
}