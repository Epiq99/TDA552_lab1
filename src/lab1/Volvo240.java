package lab1;

import java.awt.Color;

/**
 * A class that extends <code>Car</code>, that represents a Volvo 240.
 *
 * @see Car
 */
public class Volvo240 extends Car {

    /**
     * The model name for the <code>Volvo240</code> class.
     */
    private static final String MODEL_NAME = "Volvo240";

    /**
     * Affects the speed factor of the car.
     */
    private static final double TRIM_FACTOR = 1.25;

    /**
     * The engine power value for all instances of <code>Volvo240</code>.
     */
    private static final int ENGINE_POWER = 100;

    /**
     * The number of doors for all instances of <code>Volvo240</code>.
     */
    private static final int NUMBER_OF_DOORS = 4;

    /**
     * Creates a new instance of the <code>Volvo240</code> class.
     */
    public Volvo240() {
        super(MODEL_NAME, ENGINE_POWER, NUMBER_OF_DOORS);
        setColor(Color.BLACK);
    }

    @Override
    public double getSpeedFactor() {
        return getEnginePower() * 0.01 * TRIM_FACTOR;
    }
}
