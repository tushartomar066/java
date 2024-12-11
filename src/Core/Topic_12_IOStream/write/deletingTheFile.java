package Core.Topic_12_IOStream.write;

import java.io.File;

public class deletingTheFile {
    public static void main(String[] args) {
        //DELETING THE FILE OF SPECIFIC NAME
        File fo = new File("src/Topic_10_IOStream/write/output");
        // if file is present delete funxtion deletes the file otherwize throws the exception
        if (fo.delete()) {
            System.out.println("File deleted successfully ");
        } else {
            System.out.println("file not deleted ");
        }

    }
}
