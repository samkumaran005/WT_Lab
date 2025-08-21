import java.util.*;
public class ArrayBound
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.print("Eneter 10 integers:");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter index:");
        try
        {
            int ind=sc.nextInt();
            System.out.println("Element at index "+ind+": "+arr[ind]);
        }
        catch(Exception e)
        {
            System.out.println("Out of Bounds");
        }
    }
}