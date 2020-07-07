package Annotation;

import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("Annotation.Employee");
        if (aClass.isAnnotationPresent(Description.class)){
            Description annotation = aClass.getAnnotation(Description.class);
            System.out.println(annotation.value());  //class annotation...
        }

        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Description.class)){
                Description annotation = method.getAnnotation(Description.class);
                System.out.println(annotation.value());  // method annotation...
            }
        }
    }
}
