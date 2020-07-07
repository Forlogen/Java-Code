package ClassLoader;

public class ClassLoadDemo {
    public static void main(String[] args) {
        //��ȡϵͳ�������
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //��ȡ���ϲ�  ��չ�������
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@610455d6

        //��ȡ���ϲ� ��ȡ���������������
        ClassLoader bootStrapClassLoader = extClassLoader.getParent();
        System.out.println(bootStrapClassLoader);//null

        //�����û��Զ�������˵��ʹ��ϵͳ����������м���
        ClassLoader classLoader = ClassLoadDemo.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //String ��ʹ����������������м��ص�  -->java������ⶼ��ʹ����������������ص�
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);//null
    }
}
