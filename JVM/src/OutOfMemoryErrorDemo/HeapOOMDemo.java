package OutOfMemoryErrorDemo;

import java.util.ArrayList;

/*
    Java堆内存溢出分析：
    
    JVM参数： -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
    @ -Xms:设置堆内存的最小值
    @ -Xmx:设置堆内存的最大值
    当 -Xms和-Xmx相等时，堆内存不会自动扩展
    -XX:+HeapDumpOnOutOfMemoryError：用于异常抛出时Dump出当前的内存堆转储快照
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
