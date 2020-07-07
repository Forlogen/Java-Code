package IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
    java.io.PrintStream 打印流，为其他输出添加了功能，使它们能够方便的打印各种数据值表示形式
    特点：
    1. 只负责数据的输出，不负责数据的读取
    2. 与其他输出流不同，它永远不会抛出IOException
    3. 特有的方法：
        print()：输出任意类型的值
        println()：输出任意类型的值并换行

    构造方法：
    PrintStream(File file):输出目的地是一个文件
    PrintStream(OutputStream out):输出目的地是一个字节流
    PrintStream(String fileName):输出目的地是一个文件路径

    继承了父类OutputStream中共性的成员方法
    如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表
    如果使用自己特有的方法print/println方法写数据，那么写的数据原样输出

    改变输出语句的目的地（打印流的走向）
    使用System.setOut方法改变输出语句目的地为参数中传递的打印流目的地
        static void setOut(PrintStream out)：{

        }

 */
public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
//        PrintStream ps = new PrintStream("test.txt");
//        ps.write(97); // a
//        ps.println(97);  // 97
//        ps.close();

        System.out.println("hello world");
        PrintStream ps = new PrintStream("test.txt");
        System.setOut(ps);
        System.out.println("HELLO WORLD");
    }
}
