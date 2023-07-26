import java.util.*;
class NegativeException extends RuntimeException
{
    NegativeException()
    {
        System.out.println(" no is negative");
    }
}
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no;
        System.out.println("enter no");
        no=sc.nextInt();
        if(no<0)
        {
            throw new NegativeException();
        }
        else
        {
            if(no%2==0)
            {
                System.out.println("no is even no");
            }
            else
            {
                System.out.println("no is odd no");
            }
        }
    }
}