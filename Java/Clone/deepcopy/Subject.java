package Clone.deepcopy;

import java.io.Serializable;

public class Subject implements Serializable, Cloneable {
    private String name;

    public Subject(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
