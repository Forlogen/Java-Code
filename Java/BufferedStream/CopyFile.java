package BufferedStream;

import java.io.*;

/*
    单字节读取和写入：total time is: 4754 ms
    字节数组读取和写入：total time is: 11 ms
    字节缓冲区：total time is: 45 ms
    字节数组缓冲区：total time is: 4 ms
 */
public class CopyFile {
    public static void main(String[] args) {
//        CopyFileUseInAndOutputStream();
        CopyFileUseBufferedInAndOutputStream();

    }

    private static void CopyFileUseBufferedInAndOutputStream(){
        long start = System.currentTimeMillis();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\test.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("D:\\data\\Code\\Java_code\\src\\BufferedStream\\test.jpg"))){
//            int len = 0;
//            while ((len = bis.read()) != -1){
//                bos.write(len);
//            }
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = bis.read(b)) != -1){
                bos.write(b, 0, len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("total time is: " + (end - start) + " ms");
    }

    private static void CopyFileUseInAndOutputStream() {
        long start = System.currentTimeMillis();

        try (FileInputStream fis = new FileInputStream("c:\\test.jpg");
             FileOutputStream fos = new FileOutputStream("D:\\data\\Code\\Java_code\\src\\BufferedStream\\test.jpg")){
//            int len = 0;
//            while ((len = fis.read()) != -1){
//                fos.write(len);
//            }
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = fis.read(b)) != -1){
                fos.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("total time is: " + (end - start) + " ms");
    }
}
