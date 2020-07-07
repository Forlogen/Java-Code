package OutOfMemoryErrorDemo;

import java.util.ArrayList;
import java.util.Random;

public class OOMTest {
    static class Demo{
        private byte[] array;

        public Demo(int length){
            this.array = new byte[length];
        }
    }
    public static void main(String[] args) {
        ArrayList<Demo> list = new ArrayList<>();
        while(true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Demo(new Random().nextInt(1024 * 1024)));
        }
    }
}
