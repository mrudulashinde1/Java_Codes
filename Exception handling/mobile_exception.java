import java.util.*;
class InvalidLengthException extends RuntimeException
{
    InvalidLengthException() 
    {
        System.out.println("invalid length of mobile number");
    }
}
class InvalidMobileException extends RuntimeException
{
    InvalidMobileException()
    {
        System.out.println("invalid mobile number contain other symbol and characters");
    }
}
class mobile
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String m;
        int i;
        System.out.println("enter mobilr no");
        m=sc.next();
        if(m.length()!=10)
        {
            throw new InvalidLengthException();
        }
        else
        {
            for(i=0;i<m.length();i++)
            {
                char c=m.charAt(i);
                if((c>='0' && c<='9'))
                {
                    
                }
                else{
                    throw new InvalidMobileException();
                }
            }
        }
        System.out.println("valid monile no="+m);
        
    }
}
