package JDBC;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface jdbc {
    String driver();
    String url();
    String username();
    String password();
}
