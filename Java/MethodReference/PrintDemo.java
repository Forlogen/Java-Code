package MethodReference;

public class PrintDemo {
    public static void main(String[] args) {
        String str = "hello world...";
        /*
        Lambda���ʽ��Ŀ�ľ��Ǵ�ӡ�������ݵ��ַ���
        ��s���ݸ�System.out���󣬵��ö����println()���ַ����������
            ����ͷ������Ѿ�����
        ����ֱ��ʹ�÷����������Ż�Lambda���ʽ
         */

        new Printable() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        }.print(str);

        show(str, s-> System.out.println(s));

        show(str, System.out::println);
    }

    public static void show(String str, Printable p){
//        String str = "hello world...";
        p.print(str);
    }
}
