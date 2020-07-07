package OutOfMemoryErrorDemo;

import java.util.ArrayList;

/*
    Java���ڴ����������
    
    JVM������ -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
    @ -Xms:���ö��ڴ����Сֵ
    @ -Xmx:���ö��ڴ�����ֵ
    �� -Xms��-Xmx���ʱ�����ڴ治���Զ���չ
    -XX:+HeapDumpOnOutOfMemoryError�������쳣�׳�ʱDump����ǰ���ڴ��ת������
 */
public class HeapOOMDemo {
    static class OOMObject{}

    public static void main(String[] args) {
        ArrayList<OOMObject> list = new ArrayList<>();
        HeapOOMDemo demo = new HeapOOMDemo();
        try {
            while (true) {
                list.add(new OOMObject());
                Thread.sleep(10000);
            }
        } catch (Exception e){
            System.out.println(list.size());
            e.printStackTrace();
        }
    }
}
