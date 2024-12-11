package DSA.Heaps;

class MinHeap {
    int[] arr;
    int size;

    MinHeap(int x) {
        this.arr = new int[x];
        this.size = 0;
    }


}

public class MainHeap {
    public static void main(String[] args) {
        MinHeap mh = new MinHeap(10);
    }
}
