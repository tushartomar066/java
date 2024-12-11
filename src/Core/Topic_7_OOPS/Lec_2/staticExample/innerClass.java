package Core.Topic_7_OOPS.Lec_2.staticExample;

public class innerClass {

    // this class is already depend on outer class , so it will throw an error

//    class inner {
//        String name;
//
//        inner(String name) {
//            this.name = name;
//        }
//    }

    // now this will be independent of outer class

    public static class inner {
        String name;

        inner(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        //now they can easily access the class because of static
        inner obj = new inner("tushar");
        System.out.println(obj.name);

    }
}
