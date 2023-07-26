//Enter n product and dislay details
import java.util.*;
class product
{
 private int pno;
 private String pname;
 private float price;
 
 void accept()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter products details");
  System.out.println("enter products no");
  pno=sc.nextInt();
  System.out.println("enter product name");
  pname=sc.next();
  System.out.println("enter products price");
  price=sc.nextFloat();
 }
 
 void display()
 {
  System.out.println(pno+" "+pname+" "+price);
 }
}
class Access
{
 public static void main(String args[])
 {
  int n,i;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter how many product");
  n=sc.nextInt();
  product x[]=new product [n];
  for(i=0;i<n;i++)
  {
    x[i]=new product();
    x[i].accept();
  }
  for(i=0;i<n;i++)
  {
   x[i].display();
  }
 }
}
    
  
