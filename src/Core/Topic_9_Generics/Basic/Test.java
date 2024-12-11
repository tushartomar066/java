package Core.Topic_9_Generics.Basic;

public class Test<T> {
    // An object of type T is declared
    T var;

     Test(T var) {
        this.var = var;
    } // constructor

    static <T> void getClasName(T i) {

        System.out.println(i.getClass().getName());
    }

    public T getObject() {

        return this.var;
    }
}
