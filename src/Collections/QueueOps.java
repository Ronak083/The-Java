package Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueOps {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayBlockingQueue<>(6);
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
            System.out.println("Queue is Full");
        }

        for (Integer ele : que){
            System.out.println(ele);
        }
        System.out.println("*****************************");
        System.out.println(que.poll());


    }
}
