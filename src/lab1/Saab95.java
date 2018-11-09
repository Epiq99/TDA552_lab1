package lab1;

import java.awt.Color;

/**
 * A class that extends <code>Car</code>, that represents a Saab 95.
 *
 * @see Car
 */
public class Saab95 extends Car {

    private boolean turboOn;

    public Saab95() {
        super("Saab95", 125, 2);
        setColor(Color.RED);
        turboOn = false;
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

    @Override
    public double getSpeedFactor() {
        double turbo = 1;
        if (turboOn) {
            turbo = 1.3;
        }
        return getEnginePower() * 0.01 * turbo;
    }

    /**
     * Returns a boolean indicating if the current Turbo state.
     *
     * @return a boolean indicating if Turbo is on.
     */
    public boolean isTurboOn() {
        return turboOn;
    }
}