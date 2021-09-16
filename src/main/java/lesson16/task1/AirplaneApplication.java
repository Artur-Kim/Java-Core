package lesson16.task1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AirplaneApplication {

    public static void main(String[] args) throws Exception {
        Airplane airplane = new Airplane();

        Class<? extends Airplane> clazz = Airplane.class;
        Field speedField = clazz.getDeclaredField("speed");
        speedField.setAccessible(true);
        speedField.set(airplane, 299);
        speedField.set(airplane, 301);

        Method inspectMethod = clazz.getDeclaredMethod("inspect");
        inspectMethod.setAccessible(true);
        inspectMethod.invoke(airplane);

        Method flyMethod = clazz.getDeclaredMethod("fly");
        flyMethod.setAccessible(true);
        flyMethod.invoke(airplane);
    }
}
