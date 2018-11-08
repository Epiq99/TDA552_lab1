package lab1;

import java.awt.Color;

/**
 * A class that extends <code>Car</code>, that represents a Volvo 240.
 *
 * @see Car
 */
public class Volvo240 extends Car {

    /**
     * Affects the speed factor of the car.
     */
    private final static double TRIM_FACTOR = 1.25;

    public Volvo240() {
        super("Volvo240", 100, 4);
        setColor(Color.BLACK);
    }

    /**
     * @inheritDoc
     */
    @Override
    public double getSpeedFactor() {
        return getEnginePower() * 0.01 * TRIM_FACTOR;
    }
}
