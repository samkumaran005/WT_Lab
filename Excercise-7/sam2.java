import java.io.*;
public class sam2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("mydata.txt");
            int r;
            while((r=fis.read())!=-1){
                System.out.print((char)r);
            }
            fis.close();  
        } catch (FileNotFoundException e) {
            System.out.println("Exception: "+e);
        }
        catch (IOException e) {
            System.out.println("Exception: "+e);
        }
    }
}