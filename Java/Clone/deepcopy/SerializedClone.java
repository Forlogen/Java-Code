package Clone.deepcopy;

import java.io.*;

public class SerializedClone {
    public static void main(String[] args) throws IOException {
        Student s = new Student("Forlogen", 10, new Subject("Lakers"));
        Student cs = clone(s);
        System.out.println("s's address is: " + s);
        System.out.println("cs's address is: " + cs);
        System.out.println(s == cs);
        System.out.println("----------------");

        System.out.println(s.getSubject());
        System.out.println(cs.getSubject());
        System.out.println(s.getSubject() == cs.getSubject());
    }


    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T clone(T obj) throws IOException {
        T cloneObj = null;
        ByteArrayOutputStream out = null;
        ObjectOutputStream obs = null;
        ByteArrayInputStream ios = null;
        ObjectInputStream ois = null;
        try{
            // д���ֽ���
            out = new ByteArrayOutputStream();
            obs = new ObjectOutputStream(out);
            obs.writeObject(obj);

            // �����ڴ�д��ԭʼ���������¶���
            ios = new ByteArrayInputStream(out.toByteArray());
            ois = new ObjectInputStream(ios);
            cloneObj = (T) ois.readObject();
            return cloneObj;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            out.close();
            obs.close();
            ios.close();
            ois.close();
        }
        return null;
    }
}
