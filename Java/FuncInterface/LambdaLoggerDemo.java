package FuncInterface;

/*
    Lambda���ʽ�ص㣺�ӳټ���
    ʹ��ǰ�᣺������ں���ʽ�ӿ�


 */
public class LambdaLoggerDemo {
    public static void main(String[] args) {
        String m1 = "hello";
        String m2 = " world";
        String m3 = " ...";

        /*
        ʹ��Lambda���ʽ��Ϊ�������ݣ������ǰѲ������ݵ�������
        ֻ��level == 1���Ż���ýӿ��еķ������Ż�����ַ�����ƴ��
        ������������㣬��ô�ӿ��еķ����Ͳ���ִ��
        ����ƴ���ַ����Ĵ���Ҳ����ִ�У�����������ܵ��˷�
         */
        showLog(1, () ->{return m1 + m2 + m3;});
        showLog(2, () ->{return m1 + m2 + m3;});
    }
    public static void showLog(int level, MessageBuilder mb){
        // ����־�ȼ��ж�
        if (level == 1){
            System.out.println(mb.building());
        }
    }
}
