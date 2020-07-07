//package IOStream;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Arrays;
//
///*
//    java.io.InputStream：字节输入流，它是所有表示字节输入流类的超类
//
//    方法：
//    1. int read():从输入流中读取数据的下一个字节
//    2. int read(byte[] b):从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
//    3. void close():关闭此输入流并释放与该留相关的所有系统资源
//
//    java.io.FileInputStream extends InputStream
//    文件字节输入流
//    作用：把硬盘文件中的数据读取到内存中使用
//
//    构造方法：
//    FileInputStream(String name)
//    FileInputStream(File file)
//
//    作用：
//    1. 创建FileInputStream对象
//    2. 把FileInputStream对象指定构造方法中读取的文件
//
//    读取数据的原理（硬盘->内存）
//    java程序-JVM-操作系统-操作系统中读取数据的方法-读取文件
//
//    字节输入流的使用步骤：
//    1. 创建FileInputStream对象，构造方法中指定要读取的数据源
//    2. 使用FileInputStream对象的read方法，读取文件
//    3. 释放资源
//
//    字节输入流一次读取多个字节的方法：
//        int read(byte[] b):从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
//
//    String构造方法：
//    String(byte[] bytes):把字节数组转换为字符串
//    String(byte[] bytes, int offset, int length):把字节数组的一部分转换为字符串
//        offset:数组的开始索引
//        length:转换的字节长度
//
//    问题：读取中文字符时，可能会不能显式完整的字符，因为一个中文字符可能占用了多个字节存储
// */
//public class InputStreamMain {
//    public static void main(String[] args) throws IOException {
//        // 获取用户当前工作目录
//        System.out.println(System.getProperty("user.dir"));  // D:\data\Code\Java_code
////        read1();
////        read2();
////        read3();
////        read4();
//    }
//
//    /*
//    long transferTo​(OutputStream out):将所有字节从一个输入流传递到一个输出流
//     */
//    private static void read4() throws IOException{
//        FileInputStream fis = new FileInputStream("test.txt");
//        FileOutputStream fos = new FileOutputStream("test1.txt");
//        long l = fis.transferTo(fos);
//        System.out.println(l);
//
//        fis.close();
//        fos.close();
//
//    }
//
//    /*
//    byte[]	readAllBytes​():读取流中所有的字节
//    int	readNBytes​(byte[] b, int off, int len)：读取流中指定数量的字节
//     */
//    private static void read3() throws IOException {
//        FileInputStream fis = new FileInputStream("src\\test.txt");
//
//        byte[] bytes = fis.readAllBytes();
//        System.out.println(Arrays.toString(bytes));  // [98, 57, 55, 13, 10]
//    }
//
//    private static void read2() throws IOException{
//        FileInputStream fis = new FileInputStream("src\\test.txt");
//        byte[] b = new byte[2];
//        int len = 0;
//        while((len = fis.read(b)) != -1){
//            System.out.println(len); // 2 2 1
//            System.out.println(new String(b)); // AB  CD ED
//        }
//        fis.close();
//    }
//
//    private static void read1() throws IOException {
//        FileInputStream fis = new FileInputStream("src\\test.txt");
//        int len = 0;
//        /*
//        (len = fis.read()) != -1
//        fis.read()：读取一个字节
//        len = fis.read():把读取到的字节赋给len
//        (len = fis.read()) != -1:判断变量len是否等于-1
//         */
//        while ((len = fis.read()) != -1){
//            System.out.println(len);  // 65 66 67 68 69
//        }
//        fis.close();
//    }
//}
