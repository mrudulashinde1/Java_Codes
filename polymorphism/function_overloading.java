//function overloading
 import java.util.*;
 class addition
 {
     void add(int a,int b)
     {
         int c=a+b;
         System.out.println("addition is "+c);
     }
     void add(int a,int b,int c)
     {
         int d=a+b+c;
         System.out.println("addition is "+d);
     }
     void add(float m,float n)
     {
         float z=m+n;
         System.out.println("addition is "+z);
     }
 }
 class demo
 {
     public static void main(String args[])
     {
         addition x=new addition();
         Scanner sc=new Scanner(System.in);
         int a,b,c;
         float m,n;
         System.out.println("enter two Int no");
         a=sc.nextInt();
         b=sc.nextInt();
         x.add(a,b);


         System.out.println("enter three Int no");
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         x.add(a,b);
                  

                  
         System.out.println("enter two Float no");
         m=sc.nextInt();
         n=sc.nextInt();
         x.add(m,n);
                  


         

         


     }
 }