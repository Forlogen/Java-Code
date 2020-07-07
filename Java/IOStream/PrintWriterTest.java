package IOStream;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterTest {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter ps = new PrintWriter("test.txt");
        ps.write(98); // a
        ps.println(97);  // 97
        ps.close();
    }
}
