package Week1.ReadWrite;

import java.io.*;

public class FileCreate {
    public static void main(String[] args) throws IOException{
        try {
            File file1 = new File("src/Week1/ReadWrite/input.txt");
            File file2 = new File("src/Week1/ReadWrite/output.txt");
            if (file1.createNewFile() || file2.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File exists");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
