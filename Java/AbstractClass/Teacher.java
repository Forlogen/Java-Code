package AbstractClass;

public class Teacher extends Employee{

    public Teacher(int ID, String name) {
        super(ID, name);
    }

    @Override
    public void showInformation() {
        System.out.println("ID is: " + getID() + "name is: " + getName());
    }
}
