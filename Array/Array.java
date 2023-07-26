//Enter n numbers and display them and sum of even numbers
import java.util.*;
class number
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i,s=0;
  System.out.println("enter n number");
  n=sc.nextInt();
  int a[]=new int [n];
  for(i=0;i<n;i++)
  { 
    System.out.println("enter no");
    a[i]=sc.nextInt();
  }
System.out.println("display all elements");
  for(i=0;i<n;i++)
  {
   System.out.println(a[i]);
  }
   for(i=0;i<n;i++)
  {
   if(a[i]%2==0)
   {
    s=s+a[i];
   }
  }
System.out.println("Sum of even no is="+s);
}
}
