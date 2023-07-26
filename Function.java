class Arith
{
    void add(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    void mul(float a,float b,float c)
    {
        float d=a*b*c;
        System.out.println(d);
    }
    
}

class Demo
{
    public static void main(String args[])
    {
        Arith x=new Arith();
        x.add(7,9);
        x.mul(3.3F,6.2F,7.2F);
    }
}


    
