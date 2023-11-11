package chapite12_annotation;

import java.lang.annotation.Documented;

@Documented
public @interface Exercise {

int hoursPerDay() default 1;
public static final int MAX = 100;
int startHour() default 6;
String value() default "foot";
}
