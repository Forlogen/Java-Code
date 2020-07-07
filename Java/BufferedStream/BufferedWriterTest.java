package BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\data\\Code\\Java_code\\src\\BufferedStream\\test.txt"));
        for (int i = 0; i < 3; i++) {
            bw.write('a');
            bw.newLine();
        }
        bw.close();
    }
}
