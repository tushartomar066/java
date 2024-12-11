package Core.Topic_10_ExceptionHanding.customException;


public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 9;
        int b = 0;

        try {
            String str = "kunal";
            if(str.equals("kunal")){
                throw new myException("this is equal");
            }
        }
        //yeh phele try block me execute krega agr koi exception hui toh usse catch me send kr dega
        //this e will have object here , what evere will be passed in this catch  e will like e = new exception();
        //
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("no matter what will happen this will aplways execute");
        }

    }
    public static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            // when explicitly want to throw something then we can use this
            throw new ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}
