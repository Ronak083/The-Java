package FileHandling;

import java.io.*;

public class main2 {
    public static void main(String[] args) {
        File file = new File("src/FileHandling/test2");
        file.mkdir();
        file = new File("src/FileHandling/test2/ronak.txt");
        try {
            file.createNewFile();
            System.out.println("File Created");
        } catch (IOException e) {
            System.out.println("Error");
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
            bw.write("Its new file");
            bw.newLine();
            bw.write("Okay Now its annoying");
        } catch (IOException e) {
            System.out.println("Error Occured while creating File");
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/FileHandling/test2/ronak.txt"));
            String line;
            System.out.println("**************************");
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
}
