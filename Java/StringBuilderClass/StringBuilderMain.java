package StringBuilderClass;

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb); // ""

        sb.append("Forlogen");
        sb.append("kobe");
        sb.append(24);
        System.out.println(sb);  // Forlogenkobe24

        StringBuilder sb1 = new StringBuilder("Forlogen");
        System.out.println(sb1); // Forlgoen
        System.out.println(sb1.toString());  // Forlogen

        System.out.println(sb1.length());  // 8
        System.out.println(sb1.insert(3, "KOBE")); // ForKOBElogen

    }
}
