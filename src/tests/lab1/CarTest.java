package lab1;

import static java.lang.Double.compare;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toDegrees;
import static org.junit.Assert.assertEquals;

import java.awt.Color;
import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * The test class for the <code>Car</code> class.
 */
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

//    @Test
//    public void Car() {
//        Car car = new TestingCar();
////        assertSame(car.getDirection(), Direction.UP);
////        assertEquals(0, Double.compare(0.0, car.getCurrentSpeed()));
//    }

    @Test
    public void move() {
        Car car = new TestingCar();
//        for (int i = 0; i < 20; i++) {
//            car.turnLeft();
//        }
        car.startEngine();
        double speed = car.getCurrentSpeed();
        int deg = car.getDirection();
        int beforeX = car.getX();
        int beforeY = car.getY();
        int expectedX = (int) (beforeX + (speed * toDegrees(cos(deg))));
        int expectedY = (int) (beforeY + (speed * toDegrees(sin(deg))));
        car.move();

        assertEquals(expectedX, car.getX());
        assertEquals(expectedY, car.getY());
    }

    @Test
    public void turnRight() {
        Car car = new TestingCar();
        //The starting degree value is 0
        for (int i = 0; i < (360 / 5); i++) {
            if (i == 0) {
                assertEquals((i * 5), car.getDirection());
            } else {
                assertEquals((360 - (i * 5)), car.getDirection());
            }
            car.turnRight();
        }
    }

    @Test
    public void turnLeft() {
        Car car = new TestingCar();
        //The starting degree value is 0
        for (int i = 0; i < (360 / 5); i++) {
            assertEquals((i * 5), car.getDirection());
            car.turnLeft();
        }
    }

    @Test
    public void startEngine() {
        Car car = new TestingCar();
        car.startEngine();
        double speed = car.getCurrentSpeed();
        assertEquals(0, compare(Car.DEFAULT_SPEED, speed));
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
        assertEquals(0, compare(Car.DEFAULT_SPEED, car.getCurrentSpeed()));
    }

    @Test
    public void getColor() {
        Car car = new TestingCar();
        Color color = Color.ORANGE;
        car.setColor(color);
        assertEquals(color, car.getColor());
    }

    @Test
    public void getDirection() {
        Car car = new TestingCar();
        int temp = car.getDirection();
        car.turnLeft();
        assertEquals((temp + 5), car.getDirection());
    }
}