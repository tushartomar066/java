package DSA.BinaryTree;


import java.util.*;

class node {
    int val;
    node left;
    node right;

    public node(int val) {
        this.val = val;
    }
}

public class nodeOfTree {
    public static class pair {
        int data;
        node node;

        pair(node temp, int data) {
            this.data = data;
            this.node = temp;
        }
    }

    private static void topView(node root) {
        Queue<pair> q = new ArrayDeque<>();
        q.offer(new pair(root, 0));
        Map<Integer, Integer> map = new TreeMap<>();
        while (!q.isEmpty()) {
            pair temp = q.poll();
            if (!map.containsKey(temp.data)) {
                map.put(temp.data, temp.node.val);
            }
            if (temp.node.left != null) q.offer(new pair(temp.node.left, temp.data - 1));
            if (temp.node.right != null) q.offer(new pair(temp.node.right, temp.data + 1));
        }
        for (int x : map.keySet()) {
            System.out.print(map.get(x) + " ");
        }
    }

    private static void leftSideView(node a) {
        int levels = levelOfTree(a);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < levels; i++) {
            arr.add(0);
        }
        preOrderForLeftSideView(a, 0, arr);
        System.out.println(arr);
    }

    private static void preOrderForLeftSideView(node a, int i, ArrayList<Integer> arr) {

        if (a == null) return;
        arr.set(i, a.val);
        preOrderForLeftSideView(a.right, i + 1, arr);
        preOrderForLeftSideView(a.left, i + 1, arr);
    }

    public static void PreOrder(node root) {
        Stack<node> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            node temp = st.pop();
            System.out.print(temp.val + " ");
            if (temp.right != null) st.push(temp.right);
            if (temp.left != null) st.push(temp.left);
        }
    }

    public static void levelOrderTraversal(node root) {
        int prevLevel = 0;
        if (root == null) return;
        pair p = new pair(root, 0);
        Queue<pair> q = new LinkedList<>();
        q.offer(p);
        while (!q.isEmpty()) {
            pair first = q.peek();
            int x = first.data;
            node temp = first.node;
            if (prevLevel != x) {
                System.out.println();
                prevLevel++;
            }
            System.out.print(temp.val + " ");
            q.poll();
            if (temp.left != null) q.offer(new pair(temp.left, x + 1));
            if (temp.right != null) q.offer(new pair(temp.right, x + 1));
        }
    }

    public static void paths(node root, String temp, ArrayList<String> result) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            temp += root.val;
            result.add(temp);
            return;
        }
        paths(root.left, temp + root.val + "->", result);
        paths(root.right, temp + root.val + "->", result);
    }

    public static int levelOfTree(node temp) {
        if (temp == null) return 0;
        return 1 + Math.max(levelOfTree(temp.left), levelOfTree(temp.right));
    }

    public static int sizeOfTree(node temp) {
        if (temp == null) return 0;
        return 1 + sizeOfTree(temp.left) + sizeOfTree(temp.right);

    }

    public static int maxValue(node temp) {
        if (temp == null) return Integer.MIN_VALUE;
        return Math.max(temp.val, Math.max(maxValue(temp.left), maxValue(temp.right)));
    }

    public static int sum(node temp) {
        if (temp == null) return 0;
        return temp.val + sum(temp.left) + sum(temp.right);
    }

    public static void display(node temp) {
        if (temp == null) {
            return;
        }
        System.out.print(temp.val + " ");
        display(temp.left);
        display(temp.right);
    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(4);
        node c = new node(3);
        node d = new node(2);
        node e = new node(6);
        node f = new node(5);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        System.out.print("display of tree : ");
        display(a);
        System.out.println();
        System.out.println("sum of tree :" + sum(a));
        System.out.println("max value in a tree :" + maxValue(a));
        System.out.println("size of a tree : " + sizeOfTree(a));
        System.out.println("level of a tree : " + levelOfTree(a));
        ArrayList<String> arr = new ArrayList<>();
        paths(a, "", arr);
        System.out.println(arr);
        levelOrderTraversal(a);
        System.out.println();
        PreOrder(a);
        System.out.println();
        leftSideView(a);
        System.out.println();
        topView(a);

    }


}
