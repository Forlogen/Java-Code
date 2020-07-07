package Factory.AbstracFactory;

public class YSL_LipStick implements LipStickFactory{
    @Override
    public void setColor() {
        System.out.println("Red...");
    }

    @Override
    public void setEffect() {
        System.out.println("shimmer..."); // ึ้นโ
    }
}
