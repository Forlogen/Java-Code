package Annotation;

@Description("class annotation...")
public class Employee implements People{
    @Override
    public String name() {
        return null;
    }

    @Override
    @Description("method annotation...")
    public int age() {
        return 0;
    }

    @Override
    public void work() {

    }
}
