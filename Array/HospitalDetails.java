import java.util.*;
class hospital
{
 int hid;
 String hname;
 String hcity;
 
 void accept()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter hospital details");
  hid=nextInt();
  hname=next();
  hcity=next();
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
 x.accept();
 y.accept();
 z.accept();
 
 x.display();
 y.display();
 z.display();
}
}
 