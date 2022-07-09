package Week1.ReadWrite;

import java.io.*;
//inputs and outputs for 8 bits
public class ByteStreams {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("src/Week1/ReadWrite/input.txt");
            out = new FileOutputStream("src/Week1/ReadWrite/output.txt");
            int c;
            while((c=in.read()) != -1){
                out.write(c);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
