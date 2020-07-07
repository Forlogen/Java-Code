package ReflectDemo;

import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws Exception {
        // ���������ļ�
        Properties pro = new Properties();

        ClassLoader classLoader = Demo.class.getClassLoader();
        InputStream in = classLoader.getResourceAsStream("pro.properties");
        pro.load(in);

        // ��ȡ�����ļ��ж��������
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        // ��������ڴ�
        Class<?> aClass = Class.forName(className);
        // ��ȡ��������
        Method method = aClass.getMethod(methodName);
        // ��������
        Object o = aClass.newInstance();
        // ִ�з���
        method.invoke(o);
    }
}
