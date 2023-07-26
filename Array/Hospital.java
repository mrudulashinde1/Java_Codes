import java.util.*;
class hospital
{
 int hid;
 String hname;
 String hcity;
 void dis()
 {
  System.out.println("enter hospital details");
 } 

 void accept()
 {
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter hospital id");
  hid=sc.nextInt();
  System.out.println("enter hospital name");
  hname=sc.next();
  System.out.println("enter hospital city");
  hcity=sc.next();
 }
 
 void display()
 {
  System.out.println(hid+" "+hname+" "+hcity);
 }
}

class Master
{
 public static void main(String args[])
{
 hospital x=new hospital();
 hospital y=new hospital();
 hospital z=new hospital();
 x.dis();
 x.accept();
 y.accept();
 z.accept();
 
 x.display();
 y.display();
 z.display();
}
}
 