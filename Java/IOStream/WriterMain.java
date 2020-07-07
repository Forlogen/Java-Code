package IOStream;

import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.Writer:字符输出流，是所有字符输出流的最顶层的父类，抽象类
    成员方法：
    void writer(int c):写入单个字符
    void write(char[] cbuf):写入字符数组
    abstract void write(char[] cbuf, int off, int len)：写入字符数组的某一部分，off为开始索引，len为写入长度
    void write(String str):写入字符串
    void write(String str, int off, int len):
    void flush():刷新该流中的缓冲
    void close():

    java.io.FileWriter extends OutputStreamWriter extends Writer
    文件字符输出流
    把内存中字符数据写入到文件中

    构造方法：
    FileWriter(File file)
    FileWriter(File, boolean append)
    FileWriter(String filename)
    FileWriter(String filename, boolean append)
    作用：
    1. 创建FileWriter对象
    2. 根据构造方法中传递的文件路径，创建文件
    3. 将FileWriter指向创建好的文件

    字符输出流的使用步骤：
    1. 创建FileWriter对象，构造方法中绑定要写入数据的目的地
    2. 使用FileWriter中的write方法 ，把数据写入到内存缓冲区中（字符转换为字节的过程）
    3. 使用FileWriter中flush方法，把内存中缓冲区中的数据，刷新到文件中
    4. 释放资源（会先把内存缓冲区中的数据刷新到文件中）

    flush()和close()的区别：
    - flush():刷新缓冲区，流对象可以继续使用
    - close():先刷新缓冲区，然后系统释放资源，流对象不可以再被使用了
 */
public class WriterMain {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test.txt", true);
//        fw.write(97);
        char[] c = {'1', 'b', 'c'};
//        fw.write(c);
//        fw.write(c, 0, 2);
//        fw.write("AAAAA");
        fw.write("AAAAA", 0, 2);
        fw.close();
    }
}
