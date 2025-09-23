public class ReflectionArrayPrimitive {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        Class<?> arrayClass = int[].class;
        System.out.println("int.class isPrimitive: " + intClass.isPrimitive());
        System.out.println("int[].class isArray: " + arrayClass.isArray());
        System.out.println("int[].class Name: " + arrayClass.getName());
    }
}