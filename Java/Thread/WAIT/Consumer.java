package Thread.WAIT;
public class Consumer extends Thread{
    Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true){
            synchronized (product){
                if (product.flag == false){
                    System.out.println("No product, please produce a product...");
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Consuming product...");
                product.flag = false;
                product.notify();
                System.out.println("Please produce a new product...");
            }
        }
    }
}
