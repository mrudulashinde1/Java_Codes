import java.io.*;

public class FileReverse {
    public static void main(String[] args) {

        File x=new File("test.txt");
        try {
            FileReader fr =new FileReader("test.txt");
            FileWriter fw=new FileWriter("ms.txt");
            int l=(int) x.length();
            char c[]=new char[l];
            fr.read(c);
            String s=new String(c);
            StringBuffer s1=new StringBuffer(s);
            s=s1.reverse().toString();

            fw.write(s);
            fw.close();
            fr.close();
     

                        
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
