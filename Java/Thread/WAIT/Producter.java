package Thread.WAIT;


public class Producter extends Thread{
    Product product;

    public Producter(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true){
            synchronized (product){
                if (product.flag == true){
                    System.out.println("product exist, please consume product...");
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                product.name = "car";
                product.price = 2000;

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("The product has been produced...");
                product.flag = true;
                product.notify();
            }
        }
    }
}
