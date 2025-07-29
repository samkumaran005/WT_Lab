public class Swap {
    public static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=b^a;
        System.out.println("After Swap a="+a+"b="+b);
    }
    public static void main(String[] args) {
        int a=5,b=10;
        System.out.println("Before Swap a="+a+"b="+b);
        swap(a,b);
    }
}