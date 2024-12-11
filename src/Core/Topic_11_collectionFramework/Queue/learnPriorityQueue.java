package Core.Topic_11_collectionFramework.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class learnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(24);
        pq.offer(94);
        pq.offer(74);
        pq.offer(364);
        pq.offer(344);
        pq.offer(334);
        pq.offer(324);
        System.out.println(pq.peek());
        System.out.println(pq);
        /* bydefault min heap implement hota hai -> mtlb most priority min element ki hai */


    }
}
