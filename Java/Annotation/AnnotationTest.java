package Annotation;

import java.lang.annotation.Inherited;

/*
    @Override:��ⱻע���ǵķ����Ƿ�̳��Ը��ࣨ�ӿڣ���
    @Deprecated����ע���ע�������ѹ�ʱ
    @SuppressWarnings��ѹ�ƾ��棬һ�㴫�ݲ���"all"
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
