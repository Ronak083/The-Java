package FileHandling;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File directory = new File("src/FileHandling/testfile1");
        directory.mkdir();
        System.out.println("Directory Created");

        File file = new File("src/FileHandling/testfile1/ronak.txt");
        file.createNewFile();
        System.out.println("File Created");
    }

}
