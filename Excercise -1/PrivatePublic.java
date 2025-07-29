public class PrivatePublic{
    private int privateNumber = 10;
    public int publicNumber = 20;
    public void showNumbers() {
        System.out.println("Private Number: " + privateNumber);  
        System.out.println("Public Number: " + publicNumber); 
    }
    public static void main(String[] args) {
        PrivatePublic obj = new PrivatePublic();
        obj.showNumbers();
        System.out.println("Accessing Public Number: " + obj.publicNumber); // ✅
    }
}
