import java.util.*;
class maximum
{
 void max(int a,int b)
 {
  if(a>b)
  {
   System.out.println("maximum is "+a);
  }
  else
  { 
   System.out.println("maximum is "+b);
  }
 }
 void max(float m,float n)
 {
  if(m>n)
  {
   
   System.out.println("maximum is "+m);
  }
  else
  {
   
   System.out.println("maximum is "+n);
  }
 }
}
class result
{
 public static void main(String args[]) 
 {
  maximum x=new maximum();
  int a,b;
  float m,n;
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter two inr no");
  a=sc.nextInt();
  b=sc.nextInt();
  x.max(a,b);
  System.out.println("enter two float no");
  m=sc.nextFloat();
  n=sc.nextFloat();
  x.max(m,n);
  }
}

