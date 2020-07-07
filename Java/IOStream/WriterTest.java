package IOStream;

/*
    JDK7��������
    ��try�ĺ���������һ��()���������п��Զ���������
    ��ô�������������������try����Ч
    try�еĴ���ִ����ϣ����Զ��İѸ��������ͷţ�����дfinally
    ��ʽ��
    try(����������...){
        ���Ի��׳��쳣�Ĵ���
    } catch (){
        �쳣�����߼�
    }

    JDK9������
    try��ǰ�߿��Զ���������
    try���()�п���ֱ�����������������
    tyr����ִ�����֮������������Զ��ͷţ�����дfinally
    ��ʽ��
        A a = new A();
        B b = new B();
        try(a; b){

        }catch(){

        }
 */
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    public static void main(String[] args){
        FileWriter fw = null;
        try{
            fw = new FileWriter("D:\\data\\Code\\Java_code\\src\\test.txt", true);
            for (int i = 0; i < 10; i++) {
                fw.write(97 + "\r\n");
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        // JDK7������ʹ��
//        try(FileWriter fw =  new FileWriter("D:\\data\\Code\\Java_code\\src\\test.txt", true) ){
//            for (int i = 0; i < 10; i++) {
//                fw.write(97 + "\r\n");
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }

    }
}
