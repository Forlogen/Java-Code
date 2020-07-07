package IOStream;

/*
    Exception in thread "main" java.io.NotSerializableException: IOStream.Person
    当实例需要具有序列化接口时，抛出此异常

    Serializable接口，也叫标记型接口
        要进行序列化和反序列化的类必须实现Serializable接口，它会给类添加一个标记
        当进行序列化和反序列化时，就会检测类上是否有此标记
            有：可正常序列化和反序列化
            没有：抛出NotSerializableException异常

 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Object_test.txt"));
        oos.writeObject(new Person(10, "Forlogen"));
        oos.close();
    }
}
