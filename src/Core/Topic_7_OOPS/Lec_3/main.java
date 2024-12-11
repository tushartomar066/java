package Core.Topic_7_OOPS.Lec_3;

public class main {
    public static void main(String[] args) {

        box box1 = new boxweight(5, 6, 8, 22);
//        boxweight box2 = new box(1,2,3);
        // there are many variables in both parent and child class.
        // you are given access to variables that are in the ref type i.e. BoxWeight
        //hence , you should have access to weight variable
        // this also means , that the ones you are trying to access should be initialized
        // but here , when the object itself is of type parent class , how will you call the child calss constructor
        // this is why error occurs

        System.out.println(box1.getl());

    }

}
