package Factory.AbstracFactory;

// YSL-LIBRE����֮ˮ
public class YSL_Perfume implements PerfumeFactory{
    @Override
    public void setTopNote() {
        System.out.println("citrus"); // �Ȼ�������
    }

    @Override
    public void setMiddleNot() {
        System.out.println("lavender..."); // ޹�²� �Ȼ�
    }

    @Override
    public void setBaseNote() {
        System.out.println("vanilla...");  // ���  ������
    }
}
