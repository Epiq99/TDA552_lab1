package lab1;

import static java.lang.Double.compare;
import static lab1.Car.DEFAULT_SPEED;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * The test class for the <code>Volvo240</code> class.
 */
public class Volvo240Test {

//    @Test
//    public void Volvo240() {
//        Volvo240 volvo240 = new Volvo240();
//        assertEquals("Volvo240", volvo240.getModelName());
//        assertEquals(0, compare(100.0, volvo240.getEnginePower()));
//        assertEquals(4, volvo240.getNumberOfDoors());
//        assertSame(Color.BLACK, volvo240.getColor());
//    }

    @Test
    public void stopEngine() {
        Volvo240 volvo = new Volvo240();
        volvo.startEngine();
        volvo.gas(DEFAULT_SPEED);
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
        Volvo240 volvo = new Volvo240();
        volvo.startEngine();
        volvo.brake(1.0);
        assertEquals(0, compare(0, volvo.getCurrentSpeed()));

        volvo.startEngine();

        //these parameter values should result in the brake()-method not doing anything
        volvo.brake(1.01);
        volvo.brake(-0.1);
        assertEquals(0, compare(DEFAULT_SPEED, volvo.getCurrentSpeed()));
    }

    @Test
    public void getSpeedFactor() {
        Volvo240 volvo240 = new Volvo240();
        double ans = volvo240.getEnginePower() * 0.01 * 1.25;
        assertEquals(0, compare(ans, volvo240.getSpeedFactor()));
    }
}