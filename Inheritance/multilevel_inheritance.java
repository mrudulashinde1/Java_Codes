//multilevel inheritance
import java.util.*;
class student
{
    protected int rno;
    protected String name,course;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter students details");
        System.out.println("enter students roll no");
        rno=sc.nextInt();
        System.out.println("enter students name");
        name=sc.next();
        System.out.println("enter students course");
        course=sc.next();
    }
    void display()
    {
        System.out.println(rno+" "+name+" "+course);
    }
}
class mark extends student
{
    protected int m1,m2,m3;
    void accept()
    {
    super.accept();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter marks details");
    System.out.println("enter mark m1 ");
    m1=sc.nextInt();
    System.out.println("enter mark m2");
    m2=sc.nextInt();
    System.out.println("enter mark m3");
    m3=sc.nextInt();
    }
    void display()
    {
        super.display();
        System.out.println(m1+" "+m2+" "+m3);


    }


}
class result extends marks
{
    protected int total;
    protected float percentage;
    void accept()
    {
        super.accept();


    }
    void calculate()
    {
         
        total=m1+m2+m3;
        percentage=(float)total/3.0f;
        
    }
    void display()
    {
        super.display();
        System.out.println(total+" "+percentage);
         

    }
}
class StudentExample
{
    public static void main(String args[])
    {
    int n,i;
    result x[]=new result[n];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of students");
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
        x[i]=new result();
        x[i].accept();
        x[i].calculate();

    }
    for(i=0;i<n;i++)
    {
        x[i].display();
    }
    }

}