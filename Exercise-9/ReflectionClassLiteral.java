package reflections;
import java.lang.reflect.*;
class Sample{
    public int id;
    private String name;
    public Sample(){
    System.out.println("this is the constructor");
    }
}

public class ReflectionClassLiteral {
    public static void main(String[] args) throws Exception {
        Class clazz = Sample.class;
        Sample obj = new Sample();
        
        System.out.println("Public Methods:");
        Method[] methods=clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        
        System.out.println("\nPublic Constructors:");
        Constructor[] constructors=clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + " - Modifier: " + constructor.getModifiers() + " - Parameter Count: " + constructor.getParameterCount());
        }
        
        System.out.println("\nPublic Fields:");
        Field[] fields=clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " - Modifier: " + Modifier.toString(field.getModifiers()));
        }
        Field f = clazz.getDeclaredField("name");
        f.setAccessible(true);
        f.set(obj, "Reflected Name");
        System.out.println("Name: " + f.get(obj));
        
        Field fi = clazz.getDeclaredField("id");
        fi.setAccessible(true);
        fi.set(obj, 91);
        System.out.println("ID: " + fi.get(obj));
    }
}
