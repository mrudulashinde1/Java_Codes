import java.io.*;
class FileCopy
{
    public static void main(String args[]) {
        try{
            File x=new File("Test.txt");
            if(x.exists())
            {
                FileInputStream fin=new FileInputStream("Test.txt");
                FileOutputStream fout=new FileOutputStream("ms.txt");
                int l=(int)x.length();
                int c;
                for(int i=1;i<=l;i++)
                {
                    c=fin.read();
                    fout.write((char)c);
                }
                fin.close();
                fout.close();
            }
            else{
                System.out.println("file not found");
            }
        }
        catch(IOException e)
        {
        System.out.println("error");
        }        
    }
}