package Core.Topic_7_OOPS.Lec_2.staticExample;

public class objectsInInnerclass {

    static class a {
        String name;

        a(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {
        //both the object will print the Tushar and kush although tha class 'a' is static because both the inner classes are static , so they are not independent on the outer class , and they can share the instances of each other
        a obj1 = new a("Tushar");
        a obj2 = new a("kush");
        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}
