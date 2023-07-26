import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class bufferwrite {
    public static void main(String[] args) {
        File x=new File("ms.txt");

        try {
            BufferedReader br=new BufferedReader(new FileReader("ms.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("Test.txt"));
            String s;
            while (true) {
                s=br.readLine();
                if (s==null) {
                    break;
                }
                bw.write(s);
                bw.write("\n");
            }

            bw.close();
            br.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
