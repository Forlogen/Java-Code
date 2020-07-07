package Annotation;

import java.lang.annotation.Inherited;

/*
    @Override:检测被注解标记的方法是否继承自父类（接口）的
    @Deprecated：该注解标注的内容已过时
    @SuppressWarnings：压制警告，一般传递参数"all"
 */
@SuppressWarnings("all")
public class AnnotationTest {
    @Override
    public String toString() {
        return "AnnotationTest{}";
    }

    @Deprecated
    public void show(){

    }

    public void newShow(){

    }

    public void method(){
        show();
    }
}
