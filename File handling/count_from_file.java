import java.io.*;
class countcsdo
{
    public static void main(String args[])
    {
        int cp=0,sm=0,dg=0,ot=0;
        try
        {
            File x=new File("sample.txt");
            if(x.exists())
            {
                FileReader fr=new FileReader("sample.txt");
                int l=(int)x.length();
                char c[]=new char[l];
                fr.read(c);
                for(char p:c)
                {
                    if(p>='A'&& p<='Z')
                    {
                        cp++;
                    }
                    else if(p>='a'&& p<='z')
                    {
                        sm++;
                    }
                    else if(p>='0'&& p<='9')
                    {
                        dg++;
                    }
                    else
                    {
                        ot++;
                    }
                    
                }
                    System.out.println("total capital letter = "+cp);
                    System.out.println("total small letter = "+sm);
                    System.out.println("total digit letter = "+dg);
                    System.out.println("total other letter = "+ot);

                    fr.close();
            }
            else
            {
                System.out.println("file is not found");
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
    }
}
