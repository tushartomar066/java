package Core.Topic_7_OOPS.Lec_6.comparingObjects;

public class student implements Comparable<student> {
    int rollNo;
    float marks;

    student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public  int compareTo(student o) {
    int diff = (int)(this.marks - o.marks);
     return diff;
    }
}
