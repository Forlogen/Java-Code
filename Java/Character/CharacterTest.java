package Character;

public class CharacterTest {
    public static void main(String[] args) {
//        Character ch = new Character('a');
//
        System.out.println(Character.isLetter('a')); //true
        System.out.println(Character.isDigit('9'));  //true
        System.out.println(Character.isWhitespace(' '));  // true
        System.out.println(Character.isUpperCase('A'));  // true
        System.out.println(Character.isUpperCase('a')); // false
        System.out.println(Character.toUpperCase('a'));  // A
        System.out.println(Character.toLowerCase('A'));  // a
        System.out.println(Character.toString('a'));  // a
    }
}
