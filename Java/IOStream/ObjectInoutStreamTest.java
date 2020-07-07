package IOStream;

/*
    ClassNotFoundException：当不存在对象对应的class文件时抛出此异常
    反序列化的前提：
    1. 类必须实现Serializable接口接口
    2. 必须存在类对应的.class文件
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ObjectInoutStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(    "D:\\data\\Code\\Java_code\\src\\IOStream\\test.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o); // Person{age=10, name='Forlogen'}

    }
}
