/*create an abstract class shape have a abstract method area, create a two derived class circle ,rectangle
from shape class and find area of them*/
import java.util.*;
abstract class shape
{
    abstract void area();
    
}
class circle
{ 
    final float pi=3.14F;
    float r;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        r=sc.nextFloat();
    }
   void area()
  {
    float area=pi+r*r;
    System.out.println("area of circle="+area);
  }
}
class rectangle
{   float length,breadth;
   
    
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length and breadth");
        length=sc.nextFloat();
        breadth=sc.nextFloat();

    }
    void area()
    {
        float area=length*breadth;
        System.out.println("area of rectangle="+area);
    }

}
class AbstractExample
{
   public static void main(String args[])
   {
       circle x=new circle();
       x.accept();
       x.area();
       rectangle y=new rectangle();
       y.accept();
       y.area();

   }
}
