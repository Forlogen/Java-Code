package MethodArea;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

public class OOMTest extends ClassLoader {
    public static void main(String[] args) {
        int j = 0;
        try {
            OOMTest test = new OOMTest();
            for (int i = 0; i < 10000; i++) {
                //����ClassWriter��������������Ķ������ֽ���
                ClassWriter classWriter = new ClassWriter(0);
                //ָ���汾�ţ����η������������������࣬�ӿ�
                classWriter.visit(Opcodes.V1_6, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                //����byte[]
                byte[] code = classWriter.toByteArray();
                //��ļ���
                test.defineClass("Class" + i, code, 0, code.length);//Class����
                j++;
            }
        } finally {
            System.out.println(j);
        }
    }
}