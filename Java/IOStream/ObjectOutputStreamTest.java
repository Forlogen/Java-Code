package IOStream;

/*
    Exception in thread "main" java.io.NotSerializableException: IOStream.Person
    ��ʵ����Ҫ�������л��ӿ�ʱ���׳����쳣

    Serializable�ӿڣ�Ҳ�б���ͽӿ�
        Ҫ�������л��ͷ����л��������ʵ��Serializable�ӿڣ�����������һ�����
        ���������л��ͷ����л�ʱ���ͻ��������Ƿ��д˱��
            �У����������л��ͷ����л�
            û�У��׳�NotSerializableException�쳣

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
