package Factory.AbstracFactory;

// YSL-LIBRE自由之水
public class YSL_Perfume implements PerfumeFactory{
    @Override
    public void setTopNote() {
        System.out.println("citrus"); // 橙花，柑橘
    }

    @Override
    public void setMiddleNot() {
        System.out.println("lavender..."); // 薰衣草 橙花
    }

    @Override
    public void setBaseNote() {
        System.out.println("vanilla...");  // 香草  龙涎香
    }
}
