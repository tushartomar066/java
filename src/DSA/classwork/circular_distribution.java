package DSA.classwork;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class circular_distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1;i<=n;i++){
            q.offer(i);
        }
        while(q.size()!=1){
            int i = 1;
            while(i<k){
                q.offer(q.poll());
                i++;
            }
            q.poll();
        }
        System.out.println(q.peek());
    }
}
