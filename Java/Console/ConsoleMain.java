package Console;

import java.io.Console;

public class ConsoleMain {
    public static void main(String[] args) {
        Console cons = System.console();
        String username = cons.readLine();
        char[] password = cons.readPassword();

        System.out.println(username + password.toString());

    }
}
