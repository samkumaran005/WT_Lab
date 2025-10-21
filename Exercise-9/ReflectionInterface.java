package reflections;
import java.lang.reflect.*;
interface MyInterface {
    void run();
}
class Impl implements MyInterface {
    @Override
    public void run() {}
}
public class ReflectionInterface {
    public static void main(String[] args) throws Exception {
        Class clazz = MyInterface.class;
        System.out.println("Is Interface: " + clazz.isInterface());
        System.out.println("Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName() + " - Modifier: " + Modifier.toString(method.getModifiers()) + " - Return Type: " + method.getReturnType());
        }
    }
}
