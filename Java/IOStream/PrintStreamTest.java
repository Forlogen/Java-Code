package IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
    java.io.PrintStream ��ӡ����Ϊ�����������˹��ܣ�ʹ�����ܹ�����Ĵ�ӡ��������ֵ��ʾ��ʽ
    �ص㣺
    1. ֻ�������ݵ���������������ݵĶ�ȡ
    2. �������������ͬ������Զ�����׳�IOException
    3. ���еķ�����
        print()������������͵�ֵ
        println()������������͵�ֵ������

    ���췽����
    PrintStream(File file):���Ŀ�ĵ���һ���ļ�
    PrintStream(OutputStream out):���Ŀ�ĵ���һ���ֽ���
    PrintStream(String fileName):���Ŀ�ĵ���һ���ļ�·��

    �̳��˸���OutputStream�й��Եĳ�Ա����
    ���ʹ�ü̳��Ը����write����д���ݣ���ô�鿴���ݵ�ʱ����ѯ�����
    ���ʹ���Լ����еķ���print/println����д���ݣ���ôд������ԭ�����

    �ı��������Ŀ�ĵأ���ӡ��������
    ʹ��System.setOut�����ı�������Ŀ�ĵ�Ϊ�����д��ݵĴ�ӡ��Ŀ�ĵ�
        static void setOut(PrintStream out)��{

        }

 */
public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
//        PrintStream ps = new PrintStream("test.txt");
//        ps.write(97); // a
//        ps.println(97);  // 97
//        ps.close();

        System.out.println("hello world");
        PrintStream ps = new PrintStream("test.txt");
        System.setOut(ps);
        System.out.println("HELLO WORLD");
    }
}
