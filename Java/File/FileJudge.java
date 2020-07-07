package File;

import java.io.File;

/*
    File判断功能的方法：
    1. public boolean exits():此File表示的文件或目录是否实际存在
        存在则返回true，否则返回false

    2. public boolean isDirectory():此File表示的是否是目录
        用于判断构造方法中给定的路径是否以文件夹结尾

    3. public boolean isFile():此File表示的是否为文件
        用于判断构造方法中给定的路径是否以文件结尾
 */
public class FileJudge {
    public static void main(String[] args) {
        File f1 = new File("C:\\Windows\\CSUP.txt");
        System.out.println(f1.exists()); // true

        File f2 = new File("C:\\Windows\\CUP.txt");
        System.out.println(f2.exists()); // false

        File f3 = new File("C:\\Windows\\CSUP.txt");
        System.out.println(f3.isDirectory()); // false
        System.out.println(f3.isFile()); //true

        File f4 = new File("C:\\Windows");
        System.out.println(f4.isDirectory()); // true
        System.out.println(f4.isFile());  // false

    }
}
