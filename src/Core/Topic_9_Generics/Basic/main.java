package Core.Topic_9_Generics.Basic;

public class main {

    public static void main(String[] args) {
        Test obj1 = new Test<>(23);
        System.out.println(obj1.getObject());

        Test obj2 = new Test<>("Hello World");
        System.out.println(obj2.getObject());

        Test.getClasName(23);
        Test.getClasName("tushar");
        Test.getClasName(45.7);
        //passing more than one type in same function
        Test2.typeName(45,45.7);
        Test2.typeName("Geeks for Geeks",45.7);
        Test2.typeName(new Exception() ,"yo yo tushar tomar");

    }


}
