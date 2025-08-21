import java.util.*;
class Person
{
    String name;
    int age;
    public Person(String n,int a)
    {
        name=n;
        age=a;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
}
public class ArrayListPerson
{
    public static void main(String[] args) {
        ArrayList<Person> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of persons:");
        int n=sc.nextInt();
        System.out.println("Enter name and age of "+n+" persons:");
        for(int i=0;i<n;i++)
        {
            String name=sc.next();
            int age=sc.nextInt();
            a.add(new Person(name,age));
        }
        for(Person p:a)
        {
            System.out.println(p.getname()+' '+p.getage());
        }
        System.out.print("First person:");
        System.out.println(a.get(0).getname()+' '+a.get(0).getage());
        System.out.println("Enter name and age of a person to find:");
        String s=sc.next();
        int i=sc.nextInt();
        Person t=new Person(s,i);
        if(a.contains(t))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not found");
        }
    }
}