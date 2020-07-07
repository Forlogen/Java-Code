package Annotation;

import java.lang.reflect.Method;

@Prop(className = "Annotation.Person", methodName = "say")
public class PropDemo {
    public static void main(String[] args) throws Exception {
        // ��ȡClass�����
        Class<PropDemo> c = PropDemo.class;
        Prop annotation = c.getAnnotation(Prop.class);
        String className = annotation.className();
        String methodName = annotation.methodName();

        Class<?> aClass = Class.forName(className);
        // ��ȡ��������
        Method method = aClass.getMethod(methodName);
        // ��������
        Object o = aClass.newInstance();
        // ִ�з���
        method.invoke(o); // say hello...

    }
}
