package lab1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.awt.Color;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class CarTest {

    /**
     * A dummy class, used to the the functionality of the abstract class <code>Car</code>.
     */
    private class TestingCar extends Car {

        private TestingCar() {
            super("TEST", -1, -1);
        }

        @Override
        public double getSpeedFactor() {
            throw new NotImplementedException(); //this method is tested by the "real" subclasses
        }
    }

    @Test
    public void Car() {
        Car car = new TestingCar();
//        assertSame(car.getDirection(), Direction.UP);
//        assertEquals(0, Double.compare(0.0, car.getCurrentSpeed()));
    }

    @Test
    public void move() {
        Car car = new TestingCar();

//        car.startEngine();
//        double speed = car.getCurrentSpeed();
//        int beforeX = car.getX();
//        int beforeY = car.getY();
//
//        int expectedX = (int) (beforeX + speed);
//        int expectedY = (int) (beforeY + speed);
//
//        car.move();
//        int afterX = car.getX();
//        int afterY = car.getY();
//
//        assertEquals(expectedX, afterX);
//        assertEquals(expectedY, afterY);
    }

    @Test
    public void turnRight() {
        Car car = new TestingCar();
//        for (int i = 0; i < Direction.values().length; i++) {
//            Direction before = car.getDirection();
//            car.turnRight();
//            Direction after = car.getDirection();
//            switch (before) {
//                case RIGHT:
//                    assertEquals(Direction.DOWN, after);
//                    break;
//                case LEFT:
//                    assertEquals(Direction.UP, after);
//                    break;
//                case UP:
//                    assertEquals(Direction.RIGHT, after);
//                    break;
//                case DOWN:
//                    assertEquals(Direction.LEFT, after);
//                    break;
//            }
//        }
    }

    @Test
    public void turnLeft() {
        Car car = new TestingCar();
//        for (int i = 0; i < Direction.values().length; i++) {
//            Direction before = car.getDirection();
//            car.turnLeft();
//            Direction after = car.getDirection();
//            switch (before) {
//                case RIGHT:
//                    assertEquals(Direction.UP, after);
//                    break;
//                case LEFT:
//                    assertEquals(Direction.DOWN, after);
//                    break;
//                case UP:
//                    assertEquals(Direction.LEFT, after);
//                    break;
//                case DOWN:
//                    assertEquals(Direction.RIGHT, after);
//                    break;
//            }
//        }
    }

    @Test
    public void startEngine() {
        Car car = new TestingCar();
        car.startEngine();
        double speed = car.getCurrentSpeed();
        assertEquals(0, Double.compare(Car.DEFAULT_SPEED, speed));
    }

    @Test
    public void setColor() {
        Car car = new TestingCar();
        Color color = Color.ORANGE;
        car.setColor(color);
        assertEquals(color, car.getColor());
    }

    @Test
    public void getCurrentSpeed() {
        Car car = new TestingCar();
        car.startEngine(); //sets the speed to Car.DEFAULT_SPEED
        assertEquals(0, Double.compare(Car.DEFAULT_SPEED, car.getCurrentSpeed()));
    }

    @Test
    public void getColor() {
        Car car = new TestingCar();
        Color color = Color.ORANGE;
        car.setColor(color);
        assertEquals(color, car.getColor());
    }

    @Test
    public void getDirection() { //TODO might no be a very good test
        Car car = new TestingCar();
//        boolean foundValue = false;
//
//        //Ensures that the getDirection always returns a Direction
//        for (int i = 0; i < Direction.values().length; i++) {
//            car.turnRight();
//            for (Direction d : Direction.values()) {
//                foundValue = car.getDirection() == d;
//                if (foundValue) {
//                    break;
//                }
//            }
//            if (!foundValue) {
//                fail("Did not find a Direction value!");
//            }
//        }
    }
}