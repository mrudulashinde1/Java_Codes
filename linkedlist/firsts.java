import java.util.LinkedList;

import java.util.*;
class firsts {
    public static void main(String ar[]) 
    {
        LinkedList x=new LinkedList();
        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
        x.push(50);//add from first
        x.addFirst(60);
        x.addLast(60);
        x.remove(3);
        System.out.print(x+" ");

    }
}
