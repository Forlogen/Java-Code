package IOStream;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties���� extends HashTable<k, v> implements Map<k, v>
    Properties���ʾһ���־õ����Լ��� �ɱ��������л�����м���
    Properties������һ��Ψһ��IO�����ϵļ���
        ����ʹ��Properties�����еķ���store���Ѽ����е���ʱ���ݳ־û�д�뵽Ӳ���д洢
        ����ʹ��Properties�����еķ���load����Ӳ���б�����ļ���ȡ��������ʹ��

    �����б���ÿ���������Ӧֵ����һ���ַ���
        Properties������һ��˫�м��ϣ�key��valueĬ�϶����ַ���

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
        ������
            InputStream:�ֽ������������ܶ�ȡ�������ĵļ�ֵ��
            reader���ַ����������ܶ�ȡ�������ĵļ�ֵ��

        ʹ�ò��裺
            1. ����Properties���϶���
            2. ʹ��Properties���϶����е�load������ȡ�����ֵ�Ե��ļ�
            3. ����Properties����

        ע�⣺
            1. �洢��ֵ�Ե��ļ��У�����Ĭ�ϵ����ӷ��ſ���ʹ�ÿո�
            2. �洢��ֵ�Ե��ļ��У�����ʹ��#����ע�ͣ���ע�͵ļ�ֵ�Բ����ٱ���ȡ
            3. �洢��ֵ�Ե��ļ��У�����ֵĬ�϶����ַ����������ټ�����
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
        ������
            OutputStream���ֽ������������д������
            writer���ַ������������д������
            String comments:ע�ͣ�����ʹ�����ģ�Ĭ��ΪUnicode���룬һ��ʹ�ÿ��ַ���

        ʹ�ò��裺
        1. ����Properties���϶����������
        2. �����ֽ���������ַ���������󣬹��췽���а����Ŀ�ĵ�
        3. ʹ��Properties�����е�store�����Ѽ����е����ݳ־û�д�뵽Ӳ���д洢
        4. �ͷ���Դ
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
        ʹ��Properties���ϴ洢���ݣ�����ȡ�������е�����
        Properties��˫�м��ϣ�key��valueĬ�϶����ַ���
        Properties������һЩ�����ַ��������з���
            Object setProperty(String key, String value):�൱��HashTable��put����
            String getProperty(String key):ͨ��key�ҵ�valueֵ���൱��Map�����е�get(key)����
            Set<String> stringPropertyNames():���ش����������еļ��������иü������Ӧֵ���ַ������൱��Map�����е�keySet����
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
