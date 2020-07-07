package ReflectDemo;

import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws Exception {
        // 加载配置文件
        Properties pro = new Properties();

        ClassLoader classLoader = Demo.class.getClassLoader();
        InputStream in = classLoader.getResourceAsStream("pro.properties");
        pro.load(in);

        // 获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        // 加载类进内存
        Class<?> aClass = Class.forName(className);
        // 获取方法对象
        Method method = aClass.getMethod(methodName);
        // 创建对象
        Object o = aClass.newInstance();
        // 执行方法
        method.invoke(o);
    }
}
