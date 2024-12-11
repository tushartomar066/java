package Core.Topic_7_OOPS.Lec_1;

public class lec_1 {
    public static void main(String[] args) {
        student s1 = new student(1, 90, "tushar singh tomar");
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.marks);
        System.out.println();
        s1.changer("Happy Singh");
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.marks);
        student s2 = new student();


    }

}

class  student {
    //instances
    int roll;
    int marks;
    String name;

    // constructor
    student(int roll_no, int marks, String name) {
        this.roll = roll_no;
        this.marks = marks;
        this.name = name;

    }

    // calling constructor from constructor
    student() {
        this( 33,98,"random person");
    }

    // constructor overloading
    student(student another) {
        this.name = another.name;
        this.roll = another.roll;
        this.marks = another.marks;
    }


    // method
    void changer(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object destroyed successfully");
    }
}
