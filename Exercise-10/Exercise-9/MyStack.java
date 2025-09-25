import java.util.*;
public class MyStack<T> {
    private final ArrayList<T> stack = new ArrayList<>();
    public void push(T item) {
        stack.add(item);
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is empty: " + stack.isEmpty());
    }
}