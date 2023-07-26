import java.util.*;
class Cylinder 
{
   public static void main(String args[]) 
    {   
         float r,h,v;
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the radius:");
         r=sc.nextFloat();
         System.out.println("Enter the height:");
         h=sc.nextFloat();
   	 v=3.14F*r*r*h;
 
         System.out.println("volume of Cylinder is: "+v);
       
 
       
          
   }
}
