import java.util.*;
class Sphere
{
	public static void main(String args[])
 	{
	  float r,v;
          Scanner sc=new Scanner(System.in);
	  System.out.println("enter radius=");
	  r=sc.nextFloat();
	  v=1.33F*3.14F*r*r*r;
	  System.out.println("volume of sphere="+v);
	}
}