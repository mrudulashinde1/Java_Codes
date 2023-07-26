/*create an abstrct class convertor have an abstract method convert creat a two derivrd class 
KgToG and CmToM from converter class*/
import java.util.*;
abstract class convertor
{
    abstract void convert();

}
class KgToG extends convertor
{   Float Kg,g;
     void accpet()
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter kilogram");
        Kg=sc.nextFloat();


    }
    void convert()
    {
        g=Kg*1000;
        System.out.println("total gram="+g);
    }
}
class CmToM extends convertor
{
    float cm,m;
    void accept()
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter centimeters");
        cm=sc.nextFloat();

    
    }
    void convert()
    {
        m=cm/100.0F;
        System.out.println("total meters are="+m);
    }

}
class result_abstract
{
  public static void main(String args[])
  {
    KgToG mp=new KgToG();
    mp.accpet();
    mp.convert();
    CmToM pp=new CmToM();
    pp.accept();
    pp.convert();
  }
}