package lab1;

import java.awt.*;

public class Volvo240 extends Car {

    private final static double TRIM_FACTOR = 1.25;

    public Volvo240() {
        super("Volvo240", 100, 4);
        setColor(Color.BLACK);
    }

    @Override
    public double getSpeedFactor() {
        return getEnginePower() * 0.01 * TRIM_FACTOR;
    }
}
