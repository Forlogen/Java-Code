package prototype;
;
import java.io.*;

public class StarDestroyer implements Serializable, Cloneable {
    private String name;
    private double attack;
    private General general;

    public StarDestroyer(String name, double attack, General general) {
        this.name = name;
        this.attack = attack;
        this.general = general;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public General getGeneral() {
        return general;
    }

    public void setGeneral(General general) {
        this.general = general;
    }

    @Override
    public String toString() {
        return "StarDestroyer{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", general=" + general +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        StarDestroyer sd = (StarDestroyer) super.clone();
        sd.general = (General) general.clone();
        return sd;
    }

    public Object deepCopy() throws IOException {
        StarDestroyer starDestroyer = null;
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try{
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            starDestroyer = (StarDestroyer) ois.readObject();

            return starDestroyer;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            bis.close();
            bos.close();
            ois.close();
            oos.close();
        }
        return starDestroyer;
    }
}
