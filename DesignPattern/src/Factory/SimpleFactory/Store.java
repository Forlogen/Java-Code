package Factory.SimpleFactory;

public class Store {
    public static LipStick getLipStick(String brand){
        if (brand.equalsIgnoreCase("YSL")){
            return new YSL();
        } else if (brand.equalsIgnoreCase("TF")){
            return new TF();
        } else {
            return null;
        }
    }
}
