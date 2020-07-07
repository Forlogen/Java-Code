package Thread;

public class InnerClassThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("MyThread " + i);
                }
            }
        }.start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("MyRunnable " + i);
                }
            }
        }).start();

        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() +  " " + i);
        }
    }
}
