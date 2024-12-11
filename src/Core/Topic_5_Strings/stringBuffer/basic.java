package Core.Topic_5_Strings.stringBuffer;

public class basic {
    public static void main(String[] args) {

        //constructor-1
        StringBuffer sb = new StringBuffer();

        //constructor-2
        StringBuffer sb2 = new StringBuffer("tushar");

        //constructor-3  (initial by default capacity of empty Sb is 16)
        StringBuffer sb3 = new StringBuffer(30);

        //functions

        //1) to add at end
        sb2.append(" hello ");


        //2) to insert at particular index
        sb2.insert(2, "happy");

        //3) to replace between particular index
        sb2.replace(1, 3, "holalal");

        //4) to delete specific index
        sb2.delete(1,4);
        System.out.println(sb2);
    }
}
