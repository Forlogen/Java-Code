package NIO;

import java.nio.ByteBuffer;
import java.util.Scanner;

public class BufferTest {
    private static final int BUFFER = 1024 * 1024 * 1024;//1GB

    public static void main(String[] args){
        //ֱ�ӷ��䱾���ڴ�ռ�
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);
        System.out.println("ֱ���ڴ������ϣ�����ָʾ��");

        Scanner scanner = new Scanner(System.in);
        scanner.next();

        System.out.println("ֱ���ڴ濪ʼ�ͷţ�");
        byteBuffer = null;
        System.gc();
        scanner.next();
    }
}

