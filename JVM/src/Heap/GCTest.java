package Heap;

import java.util.ArrayList;
import java.util.List;

/**
 * ≤‚ ‘MinorGC °¢ MajorGC°¢FullGC
 * -Xms9m -Xmx9m -XX:+PrintGCDetails
 * @author shkstart  shkstart@126.com
 * @create 2020  14:19
 */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "forlogen.csdn.cn.com";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }

        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println(i);
        }
    }
}

