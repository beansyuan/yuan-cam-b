package yuan.cam.bb.annotation;

import java.lang.annotation.*;

/**
 * 声明注解
 */
@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
}