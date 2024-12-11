package Core.Topic_11_collectionFramework.customClass;

public class students {
    public int roll_no;
    public String name;

    public students(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }


    @Override
    public String toString() {
        return "STR {roll_no=" + roll_no + ", name='" + name + "'}";
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        students student = (students) o;
        return this.roll_no == student.roll_no;

    }
}
