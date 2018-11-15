package lab1;

import static java.lang.Double.compare;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.awt.Color;
import org.junit.Test;

public class Volvo240Test {

    @Test
    public void Volvo240() {
        Volvo240 volvo240 = new Volvo240();
        assertEquals("Volvo240", volvo240.getModelName());
        assertEquals(0, compare(100.0, volvo240.getEnginePower()));
        assertEquals(4, volvo240.getNumberOfDoors());
        assertSame(Color.BLACK, volvo240.getColor());
    }

    @Test
    public void stopEngine() {
        Volvo240 volvo = new Volvo240();
        volvo.startEngine();
        volvo.gas(Car.DEFAULT_SPEED);
        volvo.stopEngine();
        assertEquals(0, compare(volvo.getCurrentSpeed(), 0));
    }

    @Test
    public void gas() {
        Volvo240 volvo = new Volvo240();
        double amount = 0.2;
        double expected = volvo.getCurrentSpeed() + (volvo.getSpeedFactor() * amount);
        volvo.gas(amount);
        assertEquals(0, compare(expected, volvo.getCurrentSpeed()));
    }

    @Test
    public void brake() {
//        Volvo240 volvo = new Volvo240();
//        double amount = 0.2;
//        double expected = volvo.getCurrentSpeed() - (volvo.getSpeedFactor() * amount);
//        volvo.brake(amount);
//        assertEquals(0, compare(expected, volvo.getCurrentSpeed()));
    }

    @Test
    public void getSpeedFactor() {
        Volvo240 volvo240 = new Volvo240();
        double ans = volvo240.getEnginePower() * 0.01 * 1.25;
        assertEquals(0, compare(ans, volvo240.getSpeedFactor()));
    }
}