package Core.Topic_7_OOPS.practiceQuestions;


class Person {
    // Properties
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    // Additional properties
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int age, int rollNumber, double marks) {
        super(name, age); // Call the constructor of the Person class
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Setter for rollNumber
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Method to display student details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the displayDetails method of the Person class
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Method to calculate grade
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

public class studentPersonProblem {

        public static void main(String[] args) {
            // Create an instance of Student
            Student student = new Student("Mark", 40, 101, 85.5);

            // Display student details
            student.displayDetails();
        }


}
