package Factory.FactoryMethod;

public class YSL_Factory implements LipStickFactory{
    @Override
    public YSL getLipStick(){
        return new YSL();
    }
}
