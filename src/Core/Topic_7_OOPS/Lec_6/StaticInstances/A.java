package Core.Topic_7_OOPS.Lec_6.StaticInstances;

public interface A {
    // static methd always require body
    //and  they always calles by the name of instances
    static void fun() {
        System.out.println("hello world . I am static");
    }
}
