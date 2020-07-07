package prototype;

import java.io.Serializable;

public class General implements Serializable, Cloneable{
    String name;

    public General(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "General{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
