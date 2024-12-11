package Core.Topic_7_OOPS.Lec_3.typesOfInheritance.multilevel;

public class secondLevel extends multilevel {
    int age;

    secondLevel(String name, int age ){
        this.age = age;
    }

    secondLevel(secondLevel other) {

        super(other.name);
        this.age = other.age;

    }


}
