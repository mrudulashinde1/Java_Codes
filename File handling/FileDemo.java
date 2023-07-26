import java.io.*;
class FileDemo
{
     public static void main(String args[]) 
     {
        File x=new File("Test.Txt");
        System.out.println("file name "+x.getName());
        System.out.println("file path "+x.getPath());
        System.out.println("file absolute path "+x.getAbsolutePath());
        System.out.println("can file read "+x.canRead());
        System.out.println("can file write "+x.canWrite());
        System.out.println("file is exist "+x.exists());
        System.out.println(x.isFile());
        System.out.println(x.isDirectory());
      
        
     }
}