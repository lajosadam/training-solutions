package collectionsqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Practice {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(5);
        q.add(2);
        q.add(3);

        // element csak kiolvassa az első elemet
        System.out.println(q.element());
        System.out.println(q);

        //remove ki is szedi az első elemet
        System.out.println(q.remove());
        System.out.println(q);

        // peek csak kiolvassa az első elemet
        System.out.println(q.peek());
        System.out.println(q);

        //poll ki is szedi az első elemet
        System.out.println(q.poll());
        System.out.println(q);

        System.out.println("______________________");

        // deque lista:
        Deque<Integer> deque = new LinkedList<>();

        deque.add(1);
        deque.add(9);
        deque.add(6);
        deque.add(7);

        System.out.println(deque);

        //push hozzáad egy első elemet
        deque.push(12);
        System.out.println(deque);

        //pop kiszedi az első elemet
        deque.pop();
        System.out.println(deque);

        //elejéhez és végéhez adás
        deque.addFirst(11);
        deque.addLast(33);
        System.out.println(deque);
    }

}
