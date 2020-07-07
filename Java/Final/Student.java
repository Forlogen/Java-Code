package Final;

public class Student extends Person{
    @Override
    public void showInfo() {
        System.out.println("student class...");
    }
    /*
    Error:(5, 17) java: Final.Student中的showInfo()无法覆盖Final.Person中的showInfo(),被覆盖的方法为final
     */
}
