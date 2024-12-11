package Core.Topic_7_OOPS.Lec_2.staticExample;

public class staticblock {
    static int a = 10;
    static int b = 20;

  // this is always executed once the code run
    static {
        System.out.println("hello , I am static block");
        a *= 2;
    }

    public static void main(String[] args) {
        staticblock obj = new staticblock();
        obj.b += a;
        System.out.println(obj.b);

        staticblock obj2 = new staticblock();
        System.out.println(obj2.b);
        System.out.println("hello");
    }
}