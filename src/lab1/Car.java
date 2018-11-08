package lab1;

import static lab1.Direction.DOWN;
import static lab1.Direction.LEFT;
import static lab1.Direction.RIGHT;
import static lab1.Direction.UP;
import java.awt.Color;

/**
 * An abstract class depicting a car, that implements <code>Movable</code>.
 *
 * @see Movable
 */
public abstract class Car implements Movable {

    private final int nDoors;
    private final double enginePower;
    private double currentSpeed;
    private int x, y;
    private final String modelName;
    private Direction direction;
    private Color color;

    /**
     * @param modelName   the specific model name of this car.
     * @param enginePower the engine power of this car.
     * @param nDoors      the number of doors that this car has.
     */
    protected Car(String modelName, double enginePower, int nDoors) {
        this.modelName = modelName;
        this.enginePower = enginePower;
        this.nDoors = nDoors;
        direction = UP;
        stopEngine();
    }

    /**
     * Returns the speed factor of this car, which is used when the car is moving.
     *
     * @return a double value representing the speed factor of this car.
     */
    public abstract double getSpeedFactor();

    @Override
    public void move() {
        switch (direction) {
            case RIGHT:
                x += currentSpeed;
                break;
            case LEFT:
                x -= currentSpeed;
                break;
            case UP:
                y -= currentSpeed;
                break;
            case DOWN:
                y += currentSpeed;
                break;
        }
    }

    @Override
    public void turnRight() {
        switch (direction) {
            case RIGHT:
                direction = DOWN;
                break;
            case LEFT:
                direction = UP;
                break;
            case UP:
                direction = RIGHT;
                break;
            case DOWN:
                direction = LEFT;
                break;
        }
    }

    @Override
    public void turnLeft() {
        switch (direction) {
            case RIGHT:
                direction = UP;
                break;
            case LEFT:
                direction = DOWN;
                break;
            case UP:
                direction = LEFT;
                break;
            case DOWN:
                direction = RIGHT;
                break;
        }
    }

    /**
     * Sets the speed of this car to a small default value, the car will be moving
     * after calling this method.
     */
    public void startEngine() {
        currentSpeed = 0.1;
    }

    /**
     * Stops this car, by setting the speed to zero.
     */
    public void stopEngine() {
        currentSpeed = 0;
    }

    /**
     * Increases the speed of this car.
     *
     * @param amount a value used to determine the intensity of the acceleration.
     */
    public void gas(double amount) {
        incrementSpeed(amount); // TODO fix this method according to lab pm
    }

    /**
     * Decreases the speed of this car.
     *
     * @param amount value used to determine the intensity of the deceleration.
     */
    public void brake(double amount) {
        decrementSpeed(amount); // TODO fix this method according to lab pm
    }

    /**
     * Increments the speed of this car using it's current speed, speed factor and
     * the specified double value.
     *
     * @param amount value used when incrementing the speed.
     */
    private void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + (getSpeedFactor() * amount);
    }

    /**
     * Decrements the speed of this car using it's current speed, speed factor and
     * the specified double value.
     *
     * @param amount value used when decrementing the speed.
     */
    private void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - (getSpeedFactor() * amount);
    }

    /**
     * Assigns the color of this car.
     *
     * @param color the desired color.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Returns the engine power of this car.
     *
     * @return a double representing the engine power of this car.
     */
    public double getEnginePower() {
        return enginePower;
    }

    /**
     * @return
     */
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public int getNumberOfDoors() {
        return nDoors;
    }

    public String getModelName() {
        return modelName;
    }

    public Color getColor() {
        return color;
    }
}
