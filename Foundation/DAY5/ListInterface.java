package DAY5;

import java.util.*;

public class ListInterface {
    static void StackExample() {
        Stack<String> fruits = new Stack<>();
        fruits.push("mango");
        fruits.push("orange");
        fruits.push("apple");
        fruits.push("grapes");
        

        System.out.println("Fruits Stack:"+fruits);
        System.out.println("Stack top element:"+fruits.peek());
        System.out.println(fruits);

    }
    static void LinkedListExample() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list.get(0));
        System.out.println(list.set(3, 100));
        System.out.println(list.contains(100));
        System.out.println(list);
    }

    static void ArrayListExample() {
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(4);
        alist.add(3);
        alist.add(2);
        alist.add(1);

        System.out.println(alist.get(0));
        System.out.println(alist.set(3, 100));
        System.out.println(alist.contains(100));
        System.out.println(alist);

    }

    public static void main(String[] args) {
        // ArrayListExample();

        // LinkedListExample();

        StackExample();
    }
}
