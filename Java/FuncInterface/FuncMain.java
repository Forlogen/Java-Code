package FuncInterface;

/*
    ����ʽ�ӿڵ�ʹ�ã�һ�������Ϊ�����Ĳ����ͷ���ֵ����
 */
public class FuncMain {
    public static void main(String[] args) {
        // ���ýӿ�ʵ�������д����
        show(new FuncInterfaceImpl());

        // ʹ�������ڲ�����д����
        show(new FuncInterface() {
            @Override
            public void method() {
                System.out.println("Functional interface...");
            }
        });

        // ʹ��Lambda���ʽ��д����
        show(() -> {System.out.println("Functional interface...");});
        show(() -> System.out.println("Functional interface..."));

    }


    public static void show(FuncInterface fi){
        fi.method();
    }
}
