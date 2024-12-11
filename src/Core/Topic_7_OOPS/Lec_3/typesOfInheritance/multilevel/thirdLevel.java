package Core.Topic_7_OOPS.Lec_3.typesOfInheritance.multilevel;


public class thirdLevel extends secondLevel {
    int income;

    thirdLevel(String name, int age, int income ) {
        super(name, age);
        this.income = income;
    }

    thirdLevel(thirdLevel other) {
        super(other);
        this.income = other.income;
    }
}
