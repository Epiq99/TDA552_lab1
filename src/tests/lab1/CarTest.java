package lab1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CarTest {

    @Test
    public void getSpeedFactor() {
    }

    @Test
    public void move() {
        Car car = new Saab95();
        car.startEngine();
        double speed = car.getCurrentSpeed();
        int beforeX = car.getX();
        int beforeY = car.getY();

        int expectedX = (int) (beforeX + speed);
        int expectedY = (int) (beforeY + speed);

        car.move();
        int afterX = car.getX();
        int afterY = car.getY();

        assertEquals(expectedX, afterX);
        assertEquals(expectedY, afterY);
    }

    @Test
    public void turnRight() {
        Car car = new Volvo240();
        Direction before = car.getDirection();
        car.turnRight();
        Direction after = car.getDirection();
        switch (before) {
            case RIGHT:
                assertEquals(Direction.DOWN, after);
                break;
            case LEFT:
                assertEquals(Direction.UP, after);
                break;
            case UP:
                assertEquals(Direction.RIGHT, after);
                break;
            case DOWN:
                assertEquals(Direction.LEFT, after);
                break;
        }
    }

    @Test
    public void turnLeft() {
        Car car = new Volvo240();
        Direction before = car.getDirection();
        car.turnLeft();
        Direction after = car.getDirection();
        switch (before) {
            case RIGHT:
                assertEquals(Direction.UP, after);
                break;
            case LEFT:
                assertEquals(Direction.DOWN, after);
                break;
            case UP:
                assertEquals(Direction.LEFT, after);
                break;
            case DOWN:
                assertEquals(Direction.RIGHT, after);
                break;
        }
    }

    @Test
    public void startEngine() {
    }

    @Test
    public void stopEngine() {
    }

    @Test
    public void gas() {
    }

    @Test
    public void brake() {
    }

    @Test
    public void setColor() {
    }

    @Test
    public void getEnginePower() {
    }

    @Test
    public void getCurrentSpeed() {
    }

    @Test
    public void getNumberOfDoors() {
    }

    @Test
    public void getModelName() {
    }

    @Test
    public void getColor() {
    }
}