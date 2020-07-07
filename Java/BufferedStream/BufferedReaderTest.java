package BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("D:\\data\\Code\\Java_code\\src\\BufferedStream\\test.txt"));
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
