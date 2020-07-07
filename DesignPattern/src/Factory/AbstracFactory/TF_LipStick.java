package Factory.AbstracFactory;

public class TF_LipStick implements LipStickFactory{
    @Override
    public void setColor() {
        System.out.println("cameo brown...");  // ¶¹É³É«
    }

    @Override
    public void setEffect() {
        System.out.println("matte...");
    }
}
