package prototype;

import java.io.IOException;

public class Sith {
    public static void main(String[] args) throws CloneNotSupportedException, IOException {
        StarDestroyer starDestroyer = new StarDestroyer("one", 10000.0, new General("Lun"));
        StarDestroyer two = (StarDestroyer) starDestroyer.clone();

        System.out.println(starDestroyer);
        System.out.println(two);
        System.out.println(starDestroyer == two);

        /*
        StarDestroyer{name='one', attack=10000.0, general=prototype.General@2dda6444}
        StarDestroyer{name='one', attack=10000.0, general=prototype.General@5e9f23b4}
        false
         */

        StarDestroyer three = (StarDestroyer) starDestroyer.deepCopy();
        System.out.println(three);
        System.out.println(starDestroyer == three);
        /*
        StarDestroyer{name='one', attack=10000.0, general=General{name='Lun'}}
        false
         */
    }
}
