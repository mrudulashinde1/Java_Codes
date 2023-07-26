import java.util.*;
class InvalidNameException extends RuntimeException
{
    InvalidNameException()
    {
        System.out.println("name is wrong");
    }
}
class student
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int i;
        System.out.println("enter name of students");
        name=sc.next();
        for(i=0;i<name.length();i++)
        {
            char c=name.charAt(i);
            if((c>='A'&& c<='Z')||(c>='a'&& c<='z'))
            {

            }
            else{
                throw new InvalidNameException();
            }
        }
        System.out.println("valid name is"+name);
    }
}
