package IOStream;

/*
    ClassNotFoundException���������ڶ����Ӧ��class�ļ�ʱ�׳����쳣
    �����л���ǰ�᣺
    1. �����ʵ��Serializable�ӿڽӿ�
    2. ����������Ӧ��.class�ļ�
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
