package BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("D:\\data\\Code\\Java_code\\src\\BufferedStream\\test.txt"));
        bos.write(new byte[]{'a', 'b', 'c', 'd'});
        bos.close();
    }
}