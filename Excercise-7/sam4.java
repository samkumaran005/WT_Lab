import java.io.*;
public class sam4 {
    public static void main(String[] args){
        try {
            FileOutputStream fos = new FileOutputStream("source.txt");
            String str="This is copy Text!";
            byte byt[]=str.getBytes();
            fos.write(byt);
            fos.close(); 

            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream foss = new FileOutputStream("destination.txt",true);
            BufferedOutputStream bo = new BufferedOutputStream(foss);
            BufferedInputStream bi=new BufferedInputStream(fis);
            int r;
            while((r=bi.read())!=-1){
                bo.write(r);
            }
            bo.flush();
        } catch (FileNotFoundException e) {
            System.out.println("Exception: "+e);
        }
        catch (IOException e) {
            System.out.println("Exception: "+e);
        }
    }
}
