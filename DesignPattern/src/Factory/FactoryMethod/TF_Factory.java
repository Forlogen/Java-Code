package Factory.FactoryMethod;

public class TF_Factory implements LipStickFactory{
    @Override
    public TF getLipStick(){
        return new TF();
    }
}
