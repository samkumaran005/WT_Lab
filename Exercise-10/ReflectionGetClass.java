class Sample {
    public String name;
    public Sample() {}
    public Sample(int id) {}
    public void display() {}
}
public class ReflectionGetClass {
    public static void main(String[] args) throws Exception {
        Sample obj = new Sample();
        Class<?> clazz = obj.getClass();
        System.out.println("Class Name: " + clazz.getName());
        System.out.println("Superclass: " + clazz.getSuperclass().getName());
        System.out.println("Is Interface: " + clazz.isInterface());
        System.out.println("Is Array: " + clazz.isArray());
        System.out.println("Is Primitive: " + clazz.isPrimitive());
        System.out.println("\nDeclared Fields:");
        for (java.lang.reflect.Field field : clazz.getDeclaredFields()) {
            System.out.println(field.getName() + " - Modifier: " + field.getModifiers());
        }
        System.out.println("\nDeclared Methods:");
        for (java.lang.reflect.Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName() + " - Modifier: " + method.getModifiers() + " - Return Type: " + method.getReturnType());
        }
        java.lang.reflect.Method m = clazz.getDeclaredMethod("secret");
        m.setAccessible(true);
        m.invoke(obj);
    }
}