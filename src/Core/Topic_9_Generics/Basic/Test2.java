package Core.Topic_9_Generics.Basic;

public class Test2<E, F> {
    public static <E, F> void typeName(E obj1, F obj2) {
        System.out.println(obj1.getClass().getName() + " " + obj2.getClass().getName());
    }
}
