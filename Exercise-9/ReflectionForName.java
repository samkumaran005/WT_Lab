package reflections;
import java.lang.reflect.*;
class Sample{
    private int id;
    private String name;
    public Sample(){
        System.out.println("this is the constructor");
    }
    public Sample(int n){
        System.out.println("this is the constructor of value"+n);
    }
}
public class ReflectionForName {
    public static void main(String[] args) throws Exception {
        Sample obj = new Sample();
        Class clazz = Class.forName("reflections.Sample");
        System.out.println("Declared Constructors:");
        for (Constructor constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor.getName() + " - Modifier: " + constructor.getModifiers() + " - Parameter Count: " + constructor.getParameterCount());
        }
        Constructor c = clazz.getDeclaredConstructor(int.class);
        System.out.println("Specific Constructor: " + c.getName());
        
        Field f = clazz.getDeclaredField("id");
        f.setAccessible(true);
        f.set(obj, 101);
        System.out.println("Private Field Value: " + f.get(obj));
    }
}
