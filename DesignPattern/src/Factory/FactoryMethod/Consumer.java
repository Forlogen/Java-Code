package Factory.FactoryMethod;

public class Consumer {
    public static void main(String[] args) {
        TF_Factory tf_factory = new TF_Factory();
        TF lipStick = tf_factory.getLipStick();
        lipStick.show();

        YSL lipStick1 = new YSL_Factory().getLipStick();
        lipStick1.show();
    }
}
