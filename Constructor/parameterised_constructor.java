import java.util.*;
class Hospital
{
    private int hno;
    private String hname;
    private String hcity;
    Hospital()
    {
        hno=0;
        hname=" ";
        hcity=" ";

    }
    Hospital(int p,String q,String r)
    {
        hno=p;
        hname=q;
        hcity=r;

    }
    void display()
    {
        System.out.println(hno+" "+hname+" "+hcity);
    }
    
}
class Best
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n,i;int a;String b,c;
        n=sc.nextInt();
        Hospital x[]=new Hospital[n];
        for(i=0;i<n;i++)
        {
            System.out.println("enter hospital details");
            System.out.println("enter hospital no");
            a=sc.nextInt();
            System.out.println("enter hospital name");
            b=sc.next();
            System.out.println("enter hospital city");
            c=sc.next();
            x[i]=new Hospital(a,b,c);

        }
        for(i=0;i<n;i++)
        {
            x[i].display();
        }
    }
}
