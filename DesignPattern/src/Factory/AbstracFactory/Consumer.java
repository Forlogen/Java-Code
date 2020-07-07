package Factory.AbstracFactory;

public class Consumer {
    public static void main(String[] args) {
        TF_Factory tf_factory = new TF_Factory();
        LipStickFactory lipStick = tf_factory.lipFactory();
        lipStick.setColor();
        lipStick.setEffect();
        System.out.println("----------------");

        YSL_Factory ysl_factory = new YSL_Factory();
        PerfumeFactory perfume = ysl_factory.perfumeFactory();
        perfume.setTopNote();
        perfume.setMiddleNot();
        perfume.setBaseNote();
    }
}
