package basics.staticMembers.util;

public class Calculator {

    public static final Double PI = 3.14159;

    public static Double circumference(double radius) {
    return 2.0 * PI * radius;
    }

    public static Double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
