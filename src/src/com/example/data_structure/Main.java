package src.com.example.data_structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args){

        //stackTest();
        queueTest();
    }

    public static void linkedListTest(){

        // create a new linked list.
        LinkedList<Integer> lst = new LinkedList<Integer>();

        // add elements.
        lst.add(15);
        lst.add(19);
        lst.add(21);
        lst.addFirst(13);
        lst.addLast(24);
        System.out.println(lst);

        // remove elements
        lst.removeFirst();
        lst.removeLast();
        lst.remove(1);
        System.out.println(lst);

    }

    public static void stackTest(){

        Stack stack = new Stack();
        stack.push(new Integer(3));
        stack.push(new Integer(5));
        System.out.println(stack.peek());

        stack.push(new Integer(6));
        //int tmp = Integer.parseInt(stack.pop().toString());
        int tmp = (int) stack.pop();

        System.out.println(tmp);
        System.out.println(stack);

    }

    public static void queueTest(){

        Queue queue= new LinkedList();

        queue.add(2);
        queue.add(4);
        System.out.println(queue.peek());

        queue.add(5);
        queue.poll();
        System.out.println(queue);
    }

}
