package IOStream;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties集合 extends HashTable<k, v> implements Map<k, v>
    Properties类表示一个持久的属性集， 可保存在流中或从流中加载
    Properties集合是一个唯一和IO流相结合的集合
        可以使用Properties集合中的方法store，把集合中的临时数据持久化写入到硬盘中存储
        可以使用Properties集合中的方法load，把硬盘中保存的文件读取到集合中使用

    属性列表中每个键及其对应值都是一个字符串
        Properties集合是一个双列集合，key和value默认都是字符串

 */
public class PropertiesMain {
    public static void main(String[] args) throws IOException {
//        method1();
//        method2();
        method3();
    }

    private static void method3() throws IOException{
        /*
        void load(InputStream inStream):
        void load(Reader reader):
        参数：
            InputStream:字节输入流，不能读取含有中文的键值对
            reader：字符输入流，能读取含有中文的键值对

        使用步骤：
            1. 创建Properties集合对象
            2. 使用Properties集合对象中的load方法读取保存键值对的文件
            3. 遍历Properties集合

        注意：
            1. 存储键值对的文件中，键与默认的连接符号可以使用空格
            2. 存储键值对的文件中，可以使用#进行注释，被注释的键值对不会再被读取
            3. 存储键值对的文件中，键与值默认都是字符串，不用再加引号
         */
        Properties pro  = new Properties();
        pro.load(new FileReader("test.txt"));
        Set<String> set = pro.stringPropertyNames();
        for(String key:set){
            System.out.println(key + " = " + pro.getProperty(key));
        }
    }

    private static void method2() throws IOException {
        /*
        store()
        void store(OutputStream out, String comments)
        void store(Writer writer, String comments)
        参数：
            OutputStream：字节输出流，不能写入中文
            writer：字符输出流，可以写入中文
            String comments:注释，不能使用中文，默认为Unicode编码，一般使用空字符串

        使用步骤：
        1. 创建Properties集合对象，添加数据
        2. 创建字节输出流。字符输出流对象，构造方法中绑定输出目的地
        3. 使用Properties集合中的store方法把集合中的数据持久化写入到硬盘中存储
        4. 释放资源
         */
        Properties pro = new Properties();
        pro.setProperty("Forlogen", "10");
        pro.setProperty("kobe", "24");
        FileWriter fw = new FileWriter("test.txt");
        pro.store(fw, "store data");
        fw.close();
        /*
        #store data
        #Sun May 03 19:28:02 CST 2020
        kobe=24
        Forlogen=10
         */
//       pro.store(new FileOutputStream("D:\\data\\Code\\Java_code\\src\\IOStream\\test.txt"), "");

    }

    private static void method1() {
        /*
        使用Properties集合存储数据，遍历取出集合中的数据
        Properties是双列集合，key和value默认都是字符串
        Properties集合有一些操作字符串的特有方法
            Object setProperty(String key, String value):相当于HashTable的put方法
            String getProperty(String key):通过key找到value值，相当于Map集合中的get(key)方法
            Set<String> stringPropertyNames():返回此属性列中中的键集，其中该键及其对应值是字符串，相当于Map集合中的keySet方法
         */
        Properties pro = new Properties();
        pro.setProperty("Forlogen", "10");
        pro.setProperty("kobe", "24");
        Set<String> set = pro.stringPropertyNames();
        for (String key:set) {
            System.out.println(key + " = " + pro.getProperty(key));
        }
    }
}
