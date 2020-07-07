package File.FileFilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
File类中有两个和ListFiles重载的方法，方法的参数传递就是过滤器

File[] listFiles(FileFilter filter):
    java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器
    作用：用于过滤文件
    抽象方法：用来过滤文件的方法
        boolean accept(File pathname):测试指定抽象路径名是否应该包含在某个路径名列表中
            File pathname:使用ListFiles方法遍历目录，得到的每一个文件对象
File[] listFiles(FilenameFilter filter):
    java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
    作用：用于过滤文件名称
    抽象方法：用来过滤文件的方法
        boolean accept(File dir, String name)测试指定文件是否应该包含在某一文件列表中
        参数：
            File dir:构造方法中传递的被遍历的目录
            String name:使用ListFiles方法遍历目录，获取的每一个文件/文件夹的名称
    注意：两个过滤器接口没有实现类，需要我们自己写实现类，重写accept方法，在方法中定义自己的过滤规则


 */
public class FilterMain {
    public static void main(String[] args) {
        File file = new File("D:\\data\\Code\\Java_code\\src\\File");
        getAllFiles(file);
    }

    private static void getAllFiles(File dir) {

        // File[] listFiles(FileFilter filter)
        /*
        // 通过接口的实现类对象传递过滤器
        File[] files = dir.listFiles(new FileFilterImpl());  // D:\data\Code\Java_code\src\File\FileMain.java

        // 通过匿名内部类传递过滤器
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().toLowerCase().endsWith(".java");
            }
        });  // D:\data\Code\Java_code\src\File\FileMain.java

        //通过Lambda表达式简化
        File[] files = dir.listFiles((pathname) -> {return pathname.getName().toLowerCase().endsWith(".java");});
        File[] files = dir.listFiles(pathname -> pathname.getName().toLowerCase().endsWith(".java"));
        */

        // File[] listFiles(FilenameFilter filter)
        /*
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });
        */

        File[] files = dir.listFiles((d, name) -> new File(d, name).isDirectory() || name.toLowerCase().endsWith(".java"));

        for(File f: files){
            if (f.isDirectory()){
                getAllFiles(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
