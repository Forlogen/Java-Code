package MethodReference;

/*
    ͨ�����������ó�Ա����
    ʹ��ǰ�᣺
    1. �������Ѿ�����
    2. ��Ա�����Ѿ�����

 */
public class StringConvertDemo {
    public static void main(String[] args) {
        String str = "HELLO world...";
        // ͨ��Lambda���ʽʹ�ó�Ա����
        showString(str, (s)->{
            StringConvert st = new StringConvert();
            st.StringToUppercase(s);  // HELLO WORLD...
        });
        System.out.println("------------");

        // ͨ�����������ó�Ա����
        showString(str, new StringConvert()::StringToUppercase);  // HELLO WORLD...
        System.out.println("------------");

        // ͨ������ֱ�����þ�̬����
        showString(str, StringConvert::StringToLowercase);  // hello world...
    }
    public static void showString(String str, Printable p){
        p.print(str);
    }
}
