import java.util.*;
public class ArrayList {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of strings:");
        int n=sc.nextInt();
        System.out.print("Enter "+n+" strings:");
        for(int i=0;i<n;i++)
        {
            a.add(sc.next());
        }
        System.out.println("Array List:");
        for(String al:a)
        {
            System.out.println(al);
        }
        a.add(0,"Hello");
        System.out.println("After inserting element at first position:"+a);
        a.remove(5);
        System.out.println("After removing element from index 5:"+a);
        System.out.println("Element at index 4:"+a.get(4));
        a.set(6,"Vijesh");
        System.out.println("After updating element at index 6:"+a);
        System.out.print("Enter element to search:");
        String s=sc.next();
        if(a.contains(s))
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
        if(a.isEmpty())
        {
            System.out.println("ArrayList is empty");
        }
        else
        {
            System.out.println("ArrayList is not empty");
        }
        int m=a.size();
        System.out.println("Array List:");
        for(int i=0;i<m;i++)
        {
            System.out.println(a.get(i));
        }
        List<String> sub=a.subList(1,3);
        System.out.println("Sublist:"+sub);
        System.out.println("Number of elements in ArrayList:"+m);
        Collections.sort(a);
        System.out.println("Sorted ArrayList:"+a);
        Collections.shuffle(a);
        System.out.println("Shuffled ArrayList:"+a);
        Collections.reverse(a);
        System.out.println("Reversed ArrayList:"+a);
    }
}