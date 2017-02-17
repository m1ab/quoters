package quoters;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by misha on 17.02.17.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DeprecatedClass {
    Class neImpl();
}
