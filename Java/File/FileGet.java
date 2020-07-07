package File;

import java.io.File;

/*
 File类获取功能的方法：
 1. public String getAbsolutePath():返回File的绝对路径字符串
    获取的构造方法中传递的路径，无论是绝对路径还是相对路径，返回的都是绝对路径

 2. public String getPath():将此File转换为路径字符串
    获取构造方法中传递的路径，toString方法调用的就是getPath()
    public String toString(){
        return getPath();
    }

 3. public String getName():返回由此File表示的文件或目录名称
    获取的是构造方法传递的路径的结尾部分（文件/文件夹）

 4. public long length():返回此File表示的文件的长度
    获取的是构造方法中指定文件的大小，以字节为单位
        文件夹是没有大小概念的
        如果给定的路径不存在则返回0
 */
public class FileGet {
    public static void main(String[] args) {
        // getAbsolutePath()
        File f1 = new File("C:\\Windows\\CSUP.txt");
        System.out.println(f1.getAbsolutePath());  // C:\Windows\CSUP.txt
        File f2 = new File("CSUP.txt");
        System.out.println(f2.getAbsolutePath());  // D:\data\Code\Java_code\CSUP.txt

        // getPath()
        File f3 = new File("C:\\Windows\\CSUP.txt");
        System.out.println(f3.toString());  // C:\Windows\CSUP.txt
        System.out.println(f1.getPath());  // C:\Windows\CSUP.txt
        File f4 = new File("CSUP.txt");
        System.out.println(f2.getPath());  // CSUP.txt

        // getName()
        File f5 = new File("C:\\Windows\\CSUP.txt");
        System.out.println(f5.getName());  // CSUP.txt
        File f6 = new File("C:\\Windows");
        System.out.println(f6.getName());  // Windows


        File f7 = new File("C:\\Windows\\CSUP.txt");
        System.out.println(f7.length());  // Windows\\CSUP.txt");  // 10
        File f8 = new File("C:\\Windows\\CUP.txt");
        System.out.println(f8.length());  // 0

    }
}
