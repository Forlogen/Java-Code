package GC;

public class CanReliveObj {
    public static CanReliveObj obj;//����������� GC Root

    //�˷���ֻ�ܱ�����һ��
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("���õ�ǰ����д��finalize()����");
        obj = this;//��ǰ�����յĶ�����finalize()���������������ϵ�һ������obj��������ϵ
    }


    public static void main(String[] args) {
        try {
            obj = new CanReliveObj();
            // �����һ�γɹ������Լ�
            obj = null;
            System.gc();//��������������
            System.out.println("��1�� gc");
            // ��ΪFinalizer�߳����ȼ��ܵͣ���ͣ2�룬�Եȴ���
            Thread.sleep(2000);
            if (obj == null) {
                System.out.println("obj is dead");
            } else {
                System.out.println("obj is still alive");
            }
            System.out.println("��2�� gc");
            // ������δ������������ȫ��ͬ����������Ծ�ȴʧ����
            obj = null;
            System.gc();
            // ��ΪFinalizer�߳����ȼ��ܵͣ���ͣ2�룬�Եȴ���
            Thread.sleep(2000);
            if (obj == null) {
                System.out.println("obj is dead");
            } else {
                System.out.println("obj is still alive");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
