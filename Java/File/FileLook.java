package File;

import java.io.File;

/*
    File中遍历目录的方法：
    1. public String[] list():返回String数组，表示该File目录中的所有子文件或目录
    2. public File[] listFiles():返回File数组，表示该File目录中所有子文件或目录

    注意：
        list()和listFiles()遍历的是构造方法中给出的目录
        如果构造方法给出的目录的路径不存在，会抛出空指针异常
        如果构造方法汇总给给出的路径不是一个目录，也会抛出空指针异常
 */
public class FileLook {
    public static void main(String[] args) {
//        showList();
        showFileList();
    }

    private static void showFileList() {
        File file = new File("D:\\data\\Code\\Java_code\\src\\File");
        File[] l = file.listFiles();
        for(File ele: l){
            System.out.println(ele.getName());
        }

    }

    private static void showList() {
        File file = new File("D:\\data\\Code\\Java_code\\src");
        String[] l = file.list();
        for (String ele: l) {
            System.out.println(ele);
        }
    }
}
