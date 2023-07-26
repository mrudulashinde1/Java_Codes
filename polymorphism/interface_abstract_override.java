/*create an interface converter have an abstract method convert create a two derived class KgToG and CmToM fom convertor*/
import java.util.*;
interface convertor
{
    void convert();
}
class KgToG implements convertor
{
    float kg,g;
  void accept()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter kg");
      kg=sc.nextFloat();

      
  }
  public void convert()
  {
      g=kg*1000;
      System.out.println("Total gram is ="+g);

  }
}
class CmToM implements convertor 
{   float cm,m;
    void accept()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter centimeters");
      cm=sc.nextFloat();

    }
    public void convert()
    {
        m=cm/100.0F;
        System.out.println("total meteres are "+m);
    }

}
class convertExample
{
    public static void main(String args[])
    {
        KgToG x=new  KgToG();
        x.accept();
        x.convert();
        CmToM y=new CmToM();
        y.accept();
        y.convert();
    }
}
