package Annotation;

import java.lang.reflect.Method;

@Prop(className = "Annotation.Person", methodName = "say")
public class PropDemo {
    public static void main(String[] args) throws Exception {
        // 获取Class类对象
        Class<PropDemo> c = PropDemo.class;
        Prop annotation = c.getAnnotation(Prop.class);
        String className = annotation.className();
        String methodName = annotation.methodName();

        Class<?> aClass = Class.forName(className);
        // 获取方法对象
        Method method = aClass.getMethod(methodName);
        // 创建对象
        Object o = aClass.newInstance();
        // 执行方法
        method.invoke(o); // say hello...

    }
}
