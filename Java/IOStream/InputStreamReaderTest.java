package IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("D:\\data\\Code\\Java_code\\src\\IOStream\\test.txt"), "gbk");
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.println((char)len);
        }
        isr.close();
    }
}
