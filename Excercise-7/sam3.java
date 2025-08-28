import java.io.*;
public class sam3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("mydata.txt",true);
            String str="This is appended Text!";
            byte byt[]=str.getBytes();
            fos.write(byt);
            fos.close();  
        } catch (FileNotFoundException e) {
            System.out.println("Exception: "+e);
        }
        catch (IOException e) {
            System.out.println("Exception: "+e);
        }
    }
}