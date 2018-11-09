package lab1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.awt.Color;
import org.junit.Test;

public class Volvo240Test {

    @Test
    public void Volvo240() {
        Volvo240 volvo240 = new Volvo240();
        assertEquals("Volvo240", volvo240.getModelName());
        assertEquals(0, Double.compare(100.0, volvo240.getEnginePower()));
        assertEquals(4, volvo240.getNDoors());
        assertSame(Color.BLACK, volvo240.getColor());
    }

    @Test
    public void getSpeedFactor() {
        Volvo240 volvo240 = new Volvo240();
        double ans = volvo240.getEnginePower() * 0.01 * 1.25;
        assertEquals(0, Double.compare(ans, volvo240.getSpeedFactor()));
    }
}