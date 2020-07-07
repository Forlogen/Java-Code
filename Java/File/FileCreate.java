package File;

import java.io.File;
import java.io.IOException;

/*
    File创建删除功能的方法：
    1. public boolean createNewFile()：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件夹
        创建文件的路径和名称在构造方法中给出
        返回值：
            true:文件不存在，创建文件，返回true
            false:文件存在，不会创建，返回false
        此方法只能创建文件，不能创建文件夹
        创建文件的路径必须存在，否则会抛出异常

    2. public boolean delete():删除由此File表示的文件或目录
        删除构造方法中给出的文件或是文件夹
        返回值：
            true:文件/文件夹删除成功，返回true
            false:文件夹中有内容，不会删除，返回false；构造方法给出的路径不存在返回false

        直接删除的是硬盘中的内容

    3. public boolean mkdir():创建由此File表示的目录
        创建单级文件夹，创建文件夹的而路径和名称在构造方法中给出
    4. public boolean mkdirs():创建由此File表示的目录，包括任何必需但不存在的目录
        既可以创建单级空文件夹，也可创建多级文件夹
            返回值：
                true:文件夹不存在，创建文件夹，返回true
                false:文件夹已存在，不会创建，返回false，或是给出的路径已存在返回false
 */
public class FileCreate {
    public static void main(String[] args) throws IOException {
//        CreateFile();
//        CreateDir();
        DeleteFile();
    }

    private static void DeleteFile() {
        File f1 = new File("FileTest");
        System.out.println(f1.delete());
    }

    private static void CreateDir() {
        File f1 = new File("D:\\data\\Code\\Java_code\\src\\test");
        boolean b = f1.mkdirs();
        System.out.println(b);

        File f2 = new File("FileTest");
        System.out.println(f2.mkdir());
    }

    public static void CreateFile() throws IOException {
        File f1 = new File("D:\\data\\Code\\Java_code\\src\\test.txt");  // 文件不存在，返回true
        boolean b1 = f1.createNewFile();
        System.out.println(b1);
    }
}
