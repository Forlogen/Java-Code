package Factory.AbstracFactory;

public class Tf_Perfume implements PerfumeFactory{
    @Override
    public void setTopNote() {
        System.out.println("rose...");
    }

    @Override
    public void setMiddleNot() {
        System.out.println("lavender..."); // ޹�²� �Ȼ�
    }

    @Override
    public void setBaseNote() {
        System.out.println("citrus"); // �Ȼ�������
    }
}
