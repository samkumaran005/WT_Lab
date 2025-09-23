public class ReflectionForName {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Sample");
        System.out.println("Declared Constructors:");
        for (java.lang.reflect.Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor.getName() + " - Modifier: " + constructor.getModifiers() + " - Parameter Count: " + constructor.getParameterCount());
        }
        java.lang.reflect.Constructor<?> c = clazz.getDeclaredConstructor(int.class);
        System.out.println("Specific Constructor: " + c.getName());
        java.lang.reflect.Field f = clazz.getDeclaredField("id");
        f.setAccessible(true);
        Sample obj = new Sample();
        f.set(obj, 101);
        System.out.println("Private Field Value: " + f.get(obj));
    }
}