/*Enter n elements save in linkedlist do not show duplicate elements display all elementsin sorted manner display all elements in revers form*/
import java.util.*;

import javafx.util.converter.IntegerStringConverter;
class second
{
    public static void main(String args[])
    {
        LinkedList<Integer> x=new LinkedList<Integer>();
        int n,no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n ");
        n=sc.nextInt();
        for (int j = 0; j < n; j++) 
        {
            System.out.println("Enter no ");
            no=sc.nextInt();
            if(!x.contains(no))//avoid duplicate elements
            {
                x.add(no);
            }
        }
        //System.out.println(x);
        System.out.println("All Elements\n");
        for(Integer p:x)
        {
            System.out.println(p);
        }
        System.out.println("after sorting");
        Collections.sort(x);
        for(Integer p:x)
        {
            System.out.println(p);
        }
        System.out.println("reverse elements");
        Collections.reverse(x);
        for(Integer p:x)
        {
            System.out.println(p);
        }
    }
}