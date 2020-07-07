package Factory.AbstracFactory;

public class TF_Factory implements ProductFactory{
    @Override
    public LipStickFactory lipFactory() {
        return new TF_LipStick();
    }

    @Override
    public PerfumeFactory perfumeFactory() {
        return new Tf_Perfume();
    }
}
