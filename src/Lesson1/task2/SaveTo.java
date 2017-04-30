package Lesson1.task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by DmRG on 23.02.2017.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String path();
}
