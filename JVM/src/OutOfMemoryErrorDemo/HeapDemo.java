package OutOfMemoryErrorDemo;


/**
 * 1. ���öѿռ��С�Ĳ���
 * -Xms �������öѿռ䣨�����+��������ĳ�ʼ�ڴ��С
 *      -X ��jvm�����в���
 *      ms ��memory start
 * -Xmx �������öѿռ䣨�����+�������������ڴ��С
 *
 * 2. Ĭ�϶ѿռ�Ĵ�С
 *    ��ʼ�ڴ��С����������ڴ��С / 64
 *             ����ڴ��С����������ڴ��С / 4
 * 3. �ֶ����ã�-Xms600m -Xmx600m
 *     �����н��齫��ʼ���ڴ�����Ķ��ڴ����ó���ͬ��ֵ��
 *
 * 4. �鿴���õĲ�������ʽһ�� jps   /  jstat -gc ����id
 *                  ��ʽ����-XX:+PrintGCDetails
 * @author shkstart  shkstart@126.com
 * @create 2020  20:15
 */
public class HeapDemo {
    public static void main(String[] args) {

        //����Java������еĶ��ڴ�����
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        //����Java�������ͼʹ�õ������ڴ���
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;
//
//        System.out.println("-Xms : " + initialMemory + "M");
//        System.out.println("-Xmx : " + maxMemory + "M");
//
//        System.out.println("ϵͳ�ڴ��СΪ��" + initialMemory * 64.0 / 1024 + "G");
//        System.out.println("ϵͳ�ڴ��СΪ��" + maxMemory * 4.0 / 1024 + "G");

//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}

