package IOStream;

/*
    JDK7的新特性
    在try的后便可以增加一个()，在括号中可以定义流对象
    那么这个流对象的作用域就在try中有效
    try中的代码执行完毕，会自动的把该流对象释放，不用写finally
    格式：
    try(定义流对象...){
        可以会抛出异常的代码
    } catch (){
        异常处理逻辑
    }

    JDK9新特性
    try的前边可以定义流对象
    try后边()中可以直接引入流对象的名称
    tyr代码执行完毕之后，流对象可以自动释放，不用写finally
    格式：
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

//        // JDK7新特性使用
//        try(FileWriter fw =  new FileWriter("D:\\data\\Code\\Java_code\\src\\test.txt", true) ){
//            for (int i = 0; i < 10; i++) {
//                fw.write(97 + "\r\n");
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//        }

    }
}
