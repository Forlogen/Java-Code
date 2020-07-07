package Factory.AbstracFactory;

public class Tf_Perfume implements PerfumeFactory{
    @Override
    public void setTopNote() {
        System.out.println("rose...");
    }

    @Override
    public void setMiddleNot() {
        System.out.println("lavender..."); // Þ¹ÒÂ²Ý ³È»¨
    }

    @Override
    public void setBaseNote() {
        System.out.println("citrus"); // ³È»¨£¬¸ÌéÙ
    }
}
