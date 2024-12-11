package Core.Topic_11_collectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class learnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(23);
        q.offer(43);
        q.offer(43);
        q.offer(43);
        q.offer(43);
        System.out.println(q);
        q.poll();
    }

}
