package File;

import java.io.File;

/*
    java.io.File类
    作用：文件和目录路径名的抽象表示形式
    java把计算机中关于文件和文件夹的操作封装为了File类，它和系统无关，任何系统都可以使用类中的方法

    操作：
    1. 创建文件/文件夹
    2. 删除文件/文件夹
    3. 获取文件/文件夹
    4. 判断文件/文件夹是否存在
    5. 对文件夹进行遍历
    6. 获取文件大小

    绝对路径：完整的路径
    相对路径：简化的路径
 */
public class FileMain {
    public static void main(String[] args) {
        /*
        静态成员变量：
        static String pathSeparator: 与系统有关的路径分隔符
        static char pathSeparator:与系统有关的路径分隔符

        static String separator:与系统有关的默认名称分隔符
        static char separator:与系统有关的默认名称分隔符
         */
        System.out.println(File.pathSeparator);  // ;  windows:分号  Linux：冒号
        System.out.println(File.separator);      // \  windows: \    Linux: /

        /*
        构造方法：
        File(String pathname)：通过将给定路径名字符串转换为抽象路径名创建一个新的File实例
            pathname:字符串的路径名称
            路径可以是以文件结尾，也可以是以文件夹结尾
            路径可以是相对路径，也可以是绝对路径
            路径可以存在，也可以不存在
            创建File对象，只是把字符串封装为File对象，不考虑路径的真假情况
         */
        File f1 = new File("C:\\Windows\\CSUP.txt");
        System.out.println(f1); // C:\Windows\CSUP.txt

        System.out.println(new File("C:\\Windows"));  // C:\Windows
        System.out.println(new File(("CSUP.txt")));  // CSUP.txt

        /*
        File(String parent, String child):根据parent路径名字符串和child路径名字符串创建一个新的File实例
        把路径分成了两部分：
            prent:父路径
            child：子路径
        父路径和子路径可单独书写，使用灵活；父路径和子路径都可以变化
         */
        File f2 = new File("C:\\Windows", "CSUP.txt");
        System.out.println(f2);  // C:\Windows\CSUP.txt

        /*
        File(File parent, String child):根据parent抽象路径名和child路径名字符串创建一个新File实例
        把路径分成了两部分：
            prent:父路径
            child：子路径
        父路径和子路径可单独书写，使用灵活；父路径和子路径都可以变化
        父路径是File类型，可以使用File的方法对路径进行一些操作，在使用路径创建的对象
         */
        File parent = new File("C:\\");
        File f3 = new File(parent, "Windows\\CSUP.txt");
        System.out.println(f3);  // C:\Windows\CSUP.txt
    }
}
