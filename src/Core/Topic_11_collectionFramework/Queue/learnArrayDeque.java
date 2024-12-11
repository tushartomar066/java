package Core.Topic_11_collectionFramework.Queue;

import java.util.ArrayDeque;

public class learnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offerFirst(23);
        ad.offerLast(43);
        ad.offerFirst(23);
        ad.offerLast(43);
        ad.offerFirst(23);
        ad.offerFirst(23);
        ad.offerLast(43);
        ad.offerFirst(23);
        ad.offerLast(43);
        ad.pollLast();
        ad.poll();
        ad.pollFirst();
        System.out.println(ad);
        String str = "";

    }
}
