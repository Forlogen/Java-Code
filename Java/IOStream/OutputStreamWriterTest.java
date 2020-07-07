package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OutputStreamWriterTest {
    public static void main(String[] args) throws IOException {
        write_utf_8();
        write_gbk();
    }

    private static void write_gbk() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("Object_test.txt", true), StandardCharsets.ISO_8859_1);
        osw.write("梦想照进现实");
        osw.close();
    }

    private static void write_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("test.txt", true));
        osw.write("hello world");
        osw.close();
    }
}
