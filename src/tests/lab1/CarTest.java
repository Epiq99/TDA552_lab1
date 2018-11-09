package lab1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.awt.Color;
import org.junit.Test;

public class CarTest {

    @Test
    public void Car() {
        Car car = new Saab95();
        assertSame(car.getDirection(), Direction.UP);
        assertEquals(0, Double.compare(0.0, car.getCurrentSpeed()));
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
        for (int i = 0; i < Direction.values().length; i++) {
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
    }

    @Test
    public void turnLeft() {
        Car car = new Volvo240();
        for (int i = 0; i < Direction.values().length; i++) {
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
    }

    @Test
    public void startEngine() {
        Car car = new Volvo240();
        car.startEngine();
        double speed = car.getCurrentSpeed();
        assertEquals(0, Double.compare(Car.DEFAULT_SPEED, speed));
    }

    @Test
    public void stopEngine() {
        Car car = new Volvo240();
        car.startEngine();
        car.gas(Car.DEFAULT_SPEED);
        car.stopEngine();
        assertEquals(0, Double.compare(car.getCurrentSpeed(), 0));
    }

    @Test
    public void gas() {
        Car car = new Volvo240();
        double amount = 0.2;
        double expected = car.getCurrentSpeed() + (car.getSpeedFactor() * amount);
        car.gas(amount);
        assertEquals(0, Double.compare(expected, car.getCurrentSpeed()));
    }

    @Test
    public void brake() {
        Car car = new Volvo240();
        double amount = 0.2;
        double expected = car.getCurrentSpeed() - (car.getSpeedFactor() * amount);
        car.brake(amount);
        assertEquals(0, Double.compare(expected, car.getCurrentSpeed()));
    }

    @Test
    public void setColor() {
        Car car = new Volvo240();
        Color color = Color.ORANGE;
        car.setColor(color);
        assertEquals(color, car.getColor());
    }

    @Test
    public void getCurrentSpeed() {
        Car car = new Volvo240();
        car.startEngine(); //sets the speed to Car.DEFAULT_SPEED
        assertEquals(0, Double.compare(Car.DEFAULT_SPEED, car.getCurrentSpeed()));
    }

    @Test
    public void getColor() {
        Car car = new Volvo240();
        Color color = Color.ORANGE;
        car.setColor(color);
        assertEquals(color, car.getColor());
    }

    @Test
    public void getDirection() { //TODO might no be a very good test
        Car car = new Volvo240();
        boolean foundValue = false;

        //Ensures that the getDirection always returns a Direction
        for (int i = 0; i < Direction.values().length; i++) {
            car.turnRight();
            for (Direction d : Direction.values()) {
                foundValue = car.getDirection() == d;
                if (foundValue) {
                    break;
                }
            }
            if (!foundValue) {
                fail("Did not find a Direction value!");
            }
        }
    }
}