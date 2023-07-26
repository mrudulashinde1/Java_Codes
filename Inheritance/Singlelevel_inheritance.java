/*create a base class student (roll no,name,course)
create a derived class marks(m1,m2,m3,total,percentage)from student class enter n students details and display them*/
import java.util.*;
class student
{
    protected int rno;
    protected String sname;
    protected String course;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student details");
        System.out.println("enter rno");
        rno=sc.nextInt();
        System.out.println("enter student name");
        sname=sc.next();
        System.out.println("enter course");
        course=sc.next();

    }
    void display()
    {
        System.out.println(rno+" "+sname+" "+course);

    }
}
class marks extends student
{
    private int m1,m2,m3,total;
    private float percentage;
    void accept()
    {
        super.accept();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks details");
        System.out.println("enter m1");
        m1=sc.nextInt();
        System.out.println("enter m2");
        m2=sc.nextInt();
        System.out.println("enter m3 ");
        m3=sc.nextInt();
    }
    void calculate()
        {
            total=m1+m2+m3;
            percentage=(float)total/3.0F;

        }
    void display()
        {
            super.display();
            System.out.println(m1+" "+m2+" "+m3);
        }

}
class singlelevel
{

    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("enter no students");
        n=sc.nextInt();
        marks x[]=new marks[n];
        for(i=0;i<n;i++)
        {
            x[i]=new marks();
            x[i].accept();
            x[i].calculate();

        }
        for(i=0;i<n;i++)
        {
            x[i].display();
        }
    }
}

