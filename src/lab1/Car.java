package lab1;

import static java.lang.Math.cos;
import static java.lang.Math.floorDiv;
import static java.lang.Math.sin;
import static java.lang.Math.toDegrees;

import java.awt.Color;

/**
 * An abstract class depicting a car, that implements <code>Movable</code>.
 *
 * @see Movable
 */
public abstract class Car implements Movable {

    /**
     * The value that is assigned as the speed when the engine is started.
     */
    public static final double DEFAULT_SPEED = 0.1;

    private final double enginePower;
    private final int nDoors;
    private double currentSpeed;
    private int x;
    private int y;
    private int deg;
    private final String modelName;
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
        deg = 0;
        stopEngine();
    }

    /**
     * Returns the speed factor of this car, which is used when the car is moving.
     *
     * @return a double value representing the speed factor of this car.
     */
    public abstract double getSpeedFactor();

    //TODO need to calculate a CustomVector using a specified degree value
    @Override
    public void move() {
        if (currentSpeed > 0) {
            double dx = currentSpeed * toDegrees(cos(deg));
            double dy = currentSpeed * toDegrees(sin(deg));
            x += dx;
            y += dy;
        }
    }

    @Override
    public void turnRight() {
        deg -= 5;
        if (deg < 0) {
            deg += 360;
        }
    }

    @Override
    public void turnLeft() {
        deg += 5;
        if (deg >= 360) {
            deg -= 360;
        }
    }

    /**
     * Sets the speed of this car to a small default value, the car will be moving
     * after calling this method.
     */
    public void startEngine() {
        currentSpeed = DEFAULT_SPEED;
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
     * Returns the current speed of this car.
     *
     * @return a double representing the current speed of this car.
     */
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    /**
     * Returns the X-coordinate for this car.
     *
     * @return a int representing the X-coordinate for this car.
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the Y-coordinate for this car.
     *
     * @return a int representing the Y-coordinate for this car.
     */
    public int getY() {
        return y;
    }

    /**
     * Returns the number of doors on this car.
     *
     * @return an int representing the number of doors on this car.
     */
    public int getNumberOfDoors() {
        return nDoors;
    }

    public int getDirection() {
        return deg;
    }

    /**
     * Returns the model name of this car.
     *
     * @return a String representing the model name of this car.
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Returns the color of this car.
     *
     * @return a <code>Color</code> representing the color of the car.
     */
    public Color getColor() {
        return color;
    }
}
//        switch (direction) {
//            case RIGHT:
//                direction = UP;
//                break;
//            case LEFT:
//                direction = DOWN;
//                break;
//            case UP:
//                direction = LEFT;
//                break;
//            case DOWN:
//                direction = RIGHT;
//                break;
//        }

//right
//        switch (direction) {
//            case RIGHT:
//                direction = DOWN;
//                break;
//            case LEFT:
//                direction = UP;
//                break;
//            case UP:
//                direction = RIGHT;
//                break;
//            case DOWN:
//                direction = LEFT;
//                break;
//        }

//        switch (direction) {
//            case RIGHT:
//                x += currentSpeed;
//                break;
//            case LEFT:
//                x -= currentSpeed;
//                break;
//            case UP:
//                y -= currentSpeed;
//                break;
//            case DOWN:
//                y += currentSpeed;
//                break;
//        }

//    /**
//     * Returns the current direction for this car.
//     *
//     * @return a <code>Direction</code> representing the direction for the car.
//     */
//    public Direction getDirection() {
//        return direction;
//    }