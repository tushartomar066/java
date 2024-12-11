package Core.Topic_7_OOPS.practiceQuestions;

class Student1{
    private String name;
    private int roll_no;
    private double marks;

    public Student1(String name,int roll_no,double marks){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void displayDetails(){
        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(marks);
        System.out.println(calculateGrade());
    }
    public String calculateGrade(){
        if(marks>= 90){
            return "A";
        } else if (marks>=80) {
            return "B";
        }else if (marks>=70) {
            return "C";
        }else if (marks>=60) {
            return "D";
        }else {
            return "F";
        }
    }
}

public  class studentProblem {
        public static void main(String[] args) {
            Student1 s1 = new Student1("John",45,55);
            s1.displayDetails();
        }

}
