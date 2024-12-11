package Core.Topic_7_OOPS.Lec_5.abstract_classes;

public class child2 extends carrer{
    child2(int age){
        super(age);
    }
    @Override
     void career(String name){
         System.out.println("my name is "+ name);
    }
}
