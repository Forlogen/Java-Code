package IOStream;

import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.Writer:�ַ���������������ַ�����������ĸ��࣬������
    ��Ա������
    void writer(int c):д�뵥���ַ�
    void write(char[] cbuf):д���ַ�����
    abstract void write(char[] cbuf, int off, int len)��д���ַ������ĳһ���֣�offΪ��ʼ������lenΪд�볤��
    void write(String str):д���ַ���
    void write(String str, int off, int len):
    void flush():ˢ�¸����еĻ���
    void close():

    java.io.FileWriter extends OutputStreamWriter extends Writer
    �ļ��ַ������
    ���ڴ����ַ�����д�뵽�ļ���

    ���췽����
    FileWriter(File file)
    FileWriter(File, boolean append)
    FileWriter(String filename)
    FileWriter(String filename, boolean append)
    ���ã�
    1. ����FileWriter����
    2. ���ݹ��췽���д��ݵ��ļ�·���������ļ�
    3. ��FileWriterָ�򴴽��õ��ļ�

    �ַ��������ʹ�ò��裺
    1. ����FileWriter���󣬹��췽���а�Ҫд�����ݵ�Ŀ�ĵ�
    2. ʹ��FileWriter�е�write���� ��������д�뵽�ڴ滺�����У��ַ�ת��Ϊ�ֽڵĹ��̣�
    3. ʹ��FileWriter��flush���������ڴ��л������е����ݣ�ˢ�µ��ļ���
    4. �ͷ���Դ�����Ȱ��ڴ滺�����е�����ˢ�µ��ļ��У�

    flush()��close()������
    - flush():ˢ�»���������������Լ���ʹ��
    - close():��ˢ�»�������Ȼ��ϵͳ�ͷ���Դ�������󲻿����ٱ�ʹ����
 */
public class WriterMain {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test.txt", true);
//        fw.write(97);
        char[] c = {'1', 'b', 'c'};
//        fw.write(c);
//        fw.write(c, 0, 2);
//        fw.write("AAAAA");
        fw.write("AAAAA", 0, 2);
        fw.close();
    }
}
