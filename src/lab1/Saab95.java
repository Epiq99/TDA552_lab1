package lab1;

import java.awt.Color;

/**
 * A class that extends <code>Car</code>, that represents a Saab 95.
 *
 * @see Car
 */
public class Saab95 extends Car {

    /**
     * The model name for the <code>Saab95</code> class.
     */
    private static final String MODEL_NAME = "Saab95";

    /**
     * The engine power value for all instances of <code>Saab95</code>.
     */
    private static final int ENGINE_POWER = 125;

    /**
     * The number of doors for all instances of <code>Saab95</code>.
     */
    private static final int NUMBER_OF_DOORS = 2;
    private boolean turboOn;

    /**
     * Creates a new instance of the <code>Saab95</code> class.
     */
    public Saab95() {
        super(MODEL_NAME, ENGINE_POWER, NUMBER_OF_DOORS);
        setColor(Color.RED);
        turboOn = false;
    }

    @Override
    public double getSpeedFactor() {
        double turbo = 1;
        if (turboOn) {
            turbo = 1.3;
        }
        return getEnginePower() * 0.01 * turbo;
    }

    /**
     * Activates the turbo of this car.
     */
    public void setTurboOn() {
        turboOn = true;
    }

    /**
     * Deactivates the turbo of this car.
     */
    public void setTurboOff() {
        turboOn = false;
    }

    /**
     * Returns a boolean indicating if the current turbo state.
     *
     * @return a boolean indicating if turbo is on.
     */
    public boolean isTurboOn() {
        return turboOn;
    }
}