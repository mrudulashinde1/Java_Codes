import java.util.*;
class Emp
{
    private int eid;
    private String ename;
    private float salary;
    Emp()
    {
        eid=0;
        ename=" ";
        salary=0.0F;

    }
    Emp(int a,String b,float c)
    {
        eid=a;
        ename=b;
        salary=c;
    }
    void set(int a,String b,float c)
    {
        eid=a;
        ename=b;
        salary=c;
    }
    void show()
    {
        System.out.println(eid+" "+ename+" "+salary);
    }
}
    class good
    {
        public static void main(String args[])
        {
            Emp x=new Emp();
            x.set(101,"pratik",10000);
            x.show();

            Emp y=new Emp(102,"jatin",7000);
            y.show();

        }
    }
