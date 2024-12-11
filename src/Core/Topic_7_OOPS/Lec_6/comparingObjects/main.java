package Core.Topic_7_OOPS.Lec_6.comparingObjects;

public class main {
    public static void main(String[] args) {
        student st1 = new student(1 , 92.08f);
        student st2 = new student(1 , 93.08f);

        if(st1.compareTo(st2)<0){
            System.out.println("student 2 is greater");
        }
        else{
            System.out.println(" student 1 is greater");
        }

    }
}
