package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.OutputStream字节输出流，它是表示输出字节流的所有类的超类

    成员方法：
    1. public void close():关闭此输出流并释放与此相关的任何系统资源
    2. public void flush():刷新此输出流并强制任何缓冲的输出字节被写入
    3. public void write(byte[] b): 将b.length的字节从指定的字符数组写入此输出流
    4. public void write(byte[] b, int off, int len): 从执行的字节数组写入len长度的字节，从偏移量off开始输出到此输出流中
    5. public abstract void write(int b):将指定的字节输出流

    java.io.FileOutputStream extends OutputStream:文件字节输出流
    作用：把内存中的数据写入到硬盘的文件中

    构造方法：
        FileOutputStream(String name):创建一个向指定名称的文件中写入数据的输出文件流
        FileOutputStream(File file):创建一个向指定的File对象表示的文件中写入数据的文件输出流
            name:写入对象是一个路径
            File:写入对象是一个文件
        作用：
        1. 创建一个FileOutputStream对象
        2. 根据构造方法中传递的参数创建一个空文件
        3. 把FileOutputStream对象指向创建好的文件

    写入数据的原理（内存->硬盘）：
    1. 创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
    2. 调用FileOutputStream对象中的方法write，把数据写入文件中
    3. 释放资源

    追加：使用两个参数的构造方法
    FileOutputStream(string name, boolean append)
    FileOutputStream(File file, boolean append)
        append:追加写开关
        true:创建对象不会覆盖源文件，继续在文件的末尾追加写数据
        false:创建一个新文件，覆盖原文件
 */
public class IOMain {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\data\\Code\\Java_code\\src\\test.txt");
//        fos.write(68);

        /*
        public void write(byte[] b):一次写多个字节
            如果写的第一个字节是正数（0-127）,那么显式的时候会查询ASCII表
            如果写的第一个字节是负数，那么第一个字节和第二个字节共同组成一个中文显式，查询默认码表（GBK）

         String类中的getBytes()可以获取字符串对应的字节数组
         */
        byte[] b = {65, 66, 67, 68, 69};  // ABCDE
//        byte[] b = {-65, 66, 67};  // 緽C

        /*
        public void write(byte[] b, int off, int len)：写入字节数组的一部分
            off:开始索引
            len:写入的字节总数
         */
//        fos.write(b, 0, 2);

        /*

         */
        fos.write(b);
        fos.close();


    }
}
