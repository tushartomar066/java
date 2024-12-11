package Core.Topic_7_OOPS.Lec_5.abstract_classes;

public abstract class carrer {
    int age;
    final int age2;
    carrer(int age){
        this.age = age;
        age2 = 23456;
    }
    abstract void career(String name);
//    abstract void Occupation(String name);

}
