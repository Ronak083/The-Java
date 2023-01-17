package Collections;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeueOps {
    public static void main(String[] args) {
        Deque<Integer> que = new LinkedBlockingDeque<>();
        try {
            que.offer(1);
            que.offer(2);
            que.add(3);
            que.add(4);
            que.add(5);
            que.add(6);
            que.add(7);
            que.add(8);
        } catch (IllegalStateException e){
            System.out.println("Deque is Full");
        }

        for (Integer ele : que){
            System.out.println(ele);
        }

        System.out.println("*****************************");
        que.addFirst(0);
        System.out.println(que.getLast());
        System.out.println(que.getFirst());
        System.out.println(que.removeLast());

        System.out.println("*****************************");
        for (Integer ele : que){
            System.out.println(ele);
        }

        System.out.println("*****************************");
        System.out.println(que.removeFirst());
    }
}
