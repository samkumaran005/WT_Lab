public class ReflectionClassLiteral {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Sample.class;
        System.out.println("Public Methods:");
        for (java.lang.reflect.Method method : clazz.getMethods()) {
            System.out.println(method.getName());
        }
        System.out.println("\nPublic Constructors:");
        for (java.lang.reflect.Constructor<?> constructor : clazz.getConstructors()) {
            System.out.println(constructor.getName() + " - Modifier: " + constructor.getModifiers() + " - Parameter Count: " + constructor.getParameterCount());
        }
        System.out.println("\nPublic Fields:");
        for (java.lang.reflect.Field field : clazz.getFields()) {
            System.out.println(field.getName() + " - Modifier: " + field.getModifiers());
        }
        java.lang.reflect.Field f = clazz.getField("name");
        Sample obj = new Sample();
        f.set(obj, "Reflected Name");
        System.out.println("Field Value: " + f.get(obj));
    }
}