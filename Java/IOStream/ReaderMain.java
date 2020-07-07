package IOStream;

import java.io.FileReader;
import java.io.IOException;

/*
    java.io.Reader抽象类是表示用于读取字符流的所有类的超类，可以读取信息到内存中
    成员方法：
    public void close():关闭此流并释放于此六相关联的任何系统资源
    public int read():从输入流中读取一个字符
    public int read(char[] cbuf):从输入流中读取一些字符，并将它们存储到字符数组中

    java.io.FileReader extends InputStreamReader extends Reader
    作用：把硬盘文件中的数据以字符的性质读取到内存中

    构造方法：
        FileReader(String filename)
        FileReader(File file)

    作用：创建一个FileReader对象，并把FileReader对象指向要读取的文件
 */
public class ReaderMain {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test.txt");
//        int len = 0;
//        while((len = fr.read()) != -1){
//            System.out.println((char)len);
//        }

        char[] c = new char[10];
        int len = 0;
        while((len = fr.read(c)) != -1){
            System.out.println(new String(c, 0, len));
        }
        fr.close();
    }
}
