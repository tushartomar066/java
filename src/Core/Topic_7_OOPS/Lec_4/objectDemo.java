package Core.Topic_7_OOPS.Lec_4;

public class objectDemo {
    int num;
    objectDemo(){

    }
    objectDemo(int num){
        this.num = num;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((objectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        objectDemo obj = new objectDemo(34);
        objectDemo obj2 = new objectDemo(34);
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        if(obj.equals(obj2)){
            System.out.println("they are equal");
        }
    }
}
