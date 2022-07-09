package Week1.ReadWrite;

import java.io.*;

//for 18-bits char
public class CharacterStreams {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("src/Week1/ReadWrite/input.txt");
            out = new FileWriter("src/Week1/ReadWrite/output.txt");
            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null){
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
