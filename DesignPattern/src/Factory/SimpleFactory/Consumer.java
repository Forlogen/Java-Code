package Factory.SimpleFactory;

public class Consumer {
    public static void main(String[] args) {
        String message;
        LipStick ls = Store.getLipStick("Dior");
        if (ls == null) {
            System.out.println("no this lipstick...");
        } else {
            ls.show();
        }
    }
}
