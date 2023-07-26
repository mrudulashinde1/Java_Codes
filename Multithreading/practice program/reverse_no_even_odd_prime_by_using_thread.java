class REOP implements Runnable
{   
    int no;
    public void run()
    {
        Thread t=Thread.currentThread();
        String s=t.getname();
        if(s.equals("reverse"))
        {
            reverse();
        }
        else if(s.equals("EvenOdd"))
        {
            EvenOdd();
        }
        else   
        {
            prime();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in)    
        System.out.println("enter no");
        no=sc.nextInt();
        REOP x=new REOP();
        Thread y=new Thread(x);
        Thread z=new Thread(x);
        Thread z=new Thread(x);
        y.setname("reverse");
        z.getname("EvenOdd");
        w.getname("prime");
        y.start();
        z.start();
        w.start();
    }
void reverse()
{
    int m=no,d,rev;
    while(m!=0)
    {
        d=m%10;
        m=m/10;
        rev=rev*10+d;
    }
    System.out.println("reverse no is "+rev);

}
void EvenOdd()
{
    if(no%2==0)
    {
        System.out.println(no+" is even no");
    }
    else
    {
        System.out.println(no+" is even no");
    }
void prime()
{
    for(int i=2;i<no;i++)
    {
        if(no%i==0)
        {
            System.out.println(no+" is not prime no");

        }
    }
    System.out.println(no+" is prime no");

}
}

 
     