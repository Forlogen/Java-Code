package StringTable;

import org.junit.Test;

public class StringTest4 {

    @Test
    public void test1(){
        String s = new String("1");
        s.intern();//���ô˷���֮ǰ���ַ������������Ѿ�������"1"
        String s2 = "1";
        System.out.println(s == s2);  //false

        //s3������¼�ĵ�ַΪ��new String("11")
        String s3 = new String("1") + new String("1");

        //ִ������һ�д����Ժ��ַ����������У��Ƿ����"11"�أ��𰸣������ڣ���
        //jdk7:��ʱ�����в�û�д���"11",���Ǵ���һ��ָ��ѿռ���new String("11")�ĵ�ַ
        s3.intern();
        //s4������¼�ĵ�ַ��ʹ�õ�����һ�д������ִ��ʱ���ڳ����������ɵ�"11"�ĵ�ַ
        String s4 = "11";
        System.out.println(s3 == s4);//true
    }

    @Test
    public void test2(){
        String s = new String("Forlogen");
    }

    @Test
    public void test3(){
        String str = new String("a") + new String("b");
    }

}
