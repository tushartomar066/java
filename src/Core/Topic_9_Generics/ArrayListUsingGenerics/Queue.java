//package Core.Topic_9_Generics.ArrayListUsingGenerics;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Queue<E extends Number> {
//    int front;
//    int end;
//    List<E> list;
//
//    public Queue() {
//        front = end = -1;
//        list = new ArrayList<>();
//    }
//
//    E front() {
//        if (front == -1 && end == -1) {
//            throw new NullPointerException("queue is empty");
//        } else {
//            return list.get(front);
//        }
//    }
//
//    E rear() {
//        if (front == -1 && end == -1) {
//            throw new NullPointerException("queue is empty");
//        } else {
//            return list.get(end);
//        }
//    }
//
//    void enqueue(E element) {
//        if (this.isEmpty()) {
//            front = 0;
//            end = 0;
//            list.add(element);
//
//        } else {
//            end++;
//            if (list.size() > end) {
//                list.set(end, element);
//            } else {
//                list.add(element);
//            }
//
//        }
//    }
//
//    void dequeue() {
//        if (front == -1 && end == -1) {
//            NullPointerException ex = new NullPointerException("khali hai");
//            throw  ex;
//        } else if (front == end) {
//            front = end = -1;
//        } else {
//            end--;
//        }
//    }
//
//    private boolean isEmpty() {
//        if (front == -1 && end == -1) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public int size() {
//        front  = end  = -1;
//        return list.size();
//    }
//
//    public String toString() {
//        String temp = "";
//        for (int i = 0; i < list.size(); i++) {
//            temp += STR."->\{list.get(i).toString()}";
//        }
//        return temp;
//    }
//
//    public void clear() {
//        list.clear();
//    }
//
//    public static void main(String[] args) {
//        Queue<Integer> q1 = new Queue<>();
//        q1.enqueue(1);
//        q1.enqueue(2);
//        q1.enqueue(3);
//        System.out.println(STR."size of queue id \{q1.size()}");
//        q1.enqueue(4);
//        q1.enqueue(5);
//        q1.enqueue(6);
//        System.out.println(STR."front element is \{q1.front()}");
//        System.out.println(STR."last element is \{q1.rear()}");
//        q1.dequeue();
//        System.out.println(STR."last element is \{q1.rear()}");
//        q1.clear();
//        System.out.println(q1.size());
//        System.out.println(q1.front());
//
//    }
//}
//
//
//
