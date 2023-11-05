package chapite12_annotation;

public @interface Exercise {
int hoursPerDay() default 1;
int startHour() default 6;
String value() default "foot";
}
