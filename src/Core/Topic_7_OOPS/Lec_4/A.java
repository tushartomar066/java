package Core.Topic_7_OOPS.Lec_4;

public class A extends objectDemo{
    private String name;
    public int age;
    protected int salary;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    A(int num , String name, int age, int salary) {
        super(num);
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public static void main(String[] args) {
        A am = new A(22 ,"tushar" , 43 , 234000);
        System.out.println(am instanceof A); // this for checking that whether the am is instance of A or not
        System.out.println(am.getClass());//path of that class where am is created
    }
}
