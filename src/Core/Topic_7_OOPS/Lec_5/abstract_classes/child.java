package Core.Topic_7_OOPS.Lec_5.abstract_classes;

public class child extends carrer{
    int n;
    child(int age ){
        super(age);
    }
    @Override
    void career(String name){
           System.out.println("My name is "+ name);
       }
}
