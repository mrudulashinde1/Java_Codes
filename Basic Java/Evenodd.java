//enter no and check even or odd
import java.util.*;
class EvenOdd
{
 public static void main(String args[])
 {
  int a;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter no");
  a=sc.nextInt();
  if(a%2==0)
  {
   System.out.println(a+ "is even");
  }
  else
  {
   System.out.println(a+"is odd");
  }
 }
}