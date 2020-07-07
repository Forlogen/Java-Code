package Factory.AbstracFactory;

public class YSL_Factory implements ProductFactory
{
    @Override
    public LipStickFactory lipFactory() {
        return new YSL_LipStick();
    }

    @Override
    public PerfumeFactory perfumeFactory() {
        return new YSL_Perfume();
    }
}
