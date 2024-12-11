package Core.Topic_9_Generics.Basic;

public class genericConstructor {
    double var;

    <T extends Number> genericConstructor(T var) {

        this.var = var.doubleValue();
    }

    public double getVar() {

        return var;
    }

    public static void main(String[] args) {
        genericConstructor obj1 = new genericConstructor(4567);
        System.out.println(obj1.getVar());
        genericConstructor obj2 = new genericConstructor(12.234F);
        System.out.println(obj2.getVar());
    }
}
