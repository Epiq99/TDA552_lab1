package lab1;

import static java.lang.Double.compare;
import static lab1.Car.DEFAULT_SPEED;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Saab95Test {

//    @Test
//    public void Saab95() {
//        Saab95 saab = new Saab95();
//        assertEquals(MODEL_NAME, saab.getModelName());
//        assertEquals(0, Double.compare(ENGINE_POWER, saab.getEnginePower()));
//        assertEquals(NUMBER_OF_DOORS, saab.getNumberOfDoors());
//        assertSame(Color.RED, saab.getColor());
//        assertFalse(saab.isTurboOn());
//    }

    @Test
    public void stopEngine() {
        Saab95 saab = new Saab95();
        saab.startEngine();
        saab.gas(DEFAULT_SPEED);
        saab.stopEngine();
        assertEquals(0, compare(saab.getCurrentSpeed(), 0));
    }

    @Test
    public void gas() {
        Saab95 saab = new Saab95();
        double amount = 0.2;
        double expected = saab.getCurrentSpeed() + (saab.getSpeedFactor() * amount);
        saab.gas(amount);
        assertEquals(0, compare(expected, saab.getCurrentSpeed()));
    }

    @Test
    public void brake() {
        Saab95 saab = new Saab95();
        saab.startEngine();
        saab.brake(1.0);
        assertEquals(0, compare(0.0, saab.getCurrentSpeed()));

        saab.startEngine();

        //these parameter values should result in the brake()-method not doing anything
        saab.brake(1.01);
        saab.brake(-0.01);

        assertEquals(0, compare(DEFAULT_SPEED, saab.getCurrentSpeed()));
    }

    @Test
    public void getSpeedFactor() {
        Saab95 saab = new Saab95();
        double turbo = 1;
        if (saab.isTurboOn()) {
            turbo = 1.3;
        }
        double ans = saab.getEnginePower() * 0.01 * turbo;
        assertEquals(0, compare(ans, saab.getSpeedFactor()));
    }

    @Test
    public void setTurboOn() {
        Saab95 saab = new Saab95();
        saab.setTurboOff();
        saab.setTurboOn();
        assertTrue(saab.isTurboOn());
    }

    @Test
    public void setTurboOff() {
        Saab95 saab = new Saab95();
        saab.setTurboOn();
        saab.setTurboOff();
        assertFalse(saab.isTurboOn());
    }

    @Test
    public void isTurboOn() {
        Saab95 saab = new Saab95();
        saab.setTurboOn();
        assertTrue(saab.isTurboOn());
    }
}