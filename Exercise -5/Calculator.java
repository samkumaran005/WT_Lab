import java.util.*;
public class Calculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.print("Enter a and b:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.print("Enter operation (+,-,*,/):");
            char op=sc.next().charAt(0);
            int ans=0;
            switch(op)
            {
                case '+':
                    ans=a+b;
                    break;
                case '-':
                    ans=a-b;
                    break;
                case '*':
                    ans=a*b;
                    break;
                case '/':
                    if(b==0)
                    {
                        System.out.println("Denominator zero");
                        return;
                    }
                    ans=a/b;
                    break;
                default:
                    System.out.println("Invalid operator");
            }
            System.out.println("Result:"+ans);
        }
        catch(Exception e)
        {
            System.out.println("Error:One or both operands not numeric. Program now exit.");
        }
    }
}