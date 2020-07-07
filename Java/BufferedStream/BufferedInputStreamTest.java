package BufferedStream;

import java.io.*;

public class BufferedInputStreamTest {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("D:\\data\\Code\\Java_code\\src\\BufferedStream\\test.txt"));
        int len = 0;
        while ((len = bis.read()) != -1){
            System.out.println((char)len);
        }
        bis.close();
    }
}
