import java.util.*;
class first {
    public static void main(String ar[]) 
    {
        TreeSet x=new TreeSet();
        x.add(10);
        x.add(20);
        x.add(60);
        x.add(40);
        x.add(50);

      
        System.out.println(x);
        System.out.println(x.size());
        System.out.println(x.first());
        System.out.println(x.last());

    }
}
