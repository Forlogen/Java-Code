package Thread.WAIT;


public class ProductorAndConsumer {
    public static void main(String[] args) {
        Product p = new Product();

        new Consumer(p).start();
        new Producter(p).start();

    }
}
