/*create an abstract class shape have an abstract method volume create a two derivrd class cylinder and sphere from shape class find volume of them*/
import java.util.*;
abstract class shape
{
    abstract void volume();

}
class cylinder extends shape
{   float v,r,h;
    final float pi=3.14F;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of cylinder");
        r=sc.nextFloat();
        System.out.println("enter height of circle");
        h=sc.nextFloat();

    }
    void volume()
    {
        v=pi*r*r*h;
        System.out.println("volume of cylinder="+v);
    }
}
class sphere extends shape
{   
    final float pi=3.14F;
    float r,v;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of sphere");
        r=sc.nextFloat();
        
        
    }
    void volume()
    {
        v=1.33F*pi*r*r*r;
        System.out.println("volume of sphere="+v);
    }

}
class Result
{
    public static void main(String args[])
    {
        cylinder x=new cylinder();
        x.accept();
        x.volume();
        sphere y=new sphere();
        y.accept();
        y.volume();

    }
}
