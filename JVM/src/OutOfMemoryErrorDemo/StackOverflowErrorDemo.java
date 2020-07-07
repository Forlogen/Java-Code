package OutOfMemoryErrorDemo;

public class StackOverflowErrorDemo {
    private static int stackLength = 0;
    public static void main(String[] args) {
        StackOverflowErrorDemo demo = new StackOverflowErrorDemo();
        try {
            demo.pusStack();
        } catch (Throwable e){
            System.out.println("stack length is: " + demo.stackLength);
            throw e;
        }
    }
    public void pusStack(){
            stackLength++;
            pusStack();
    }
}

