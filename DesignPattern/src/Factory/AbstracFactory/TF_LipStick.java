package Factory.AbstracFactory;

public class TF_LipStick implements LipStickFactory{
    @Override
    public void setColor() {
        System.out.println("cameo brown...");  // ��ɳɫ
    }

    @Override
    public void setEffect() {
        System.out.println("matte...");
    }
}
