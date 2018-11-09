package lab1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.awt.Color;
import org.junit.Test;

public class Saab95Test {

    @Test
    public void Saab95() {
        Saab95 saab = new Saab95();
        assertEquals("Saab95", saab.getModelName());

        //TODO should this use static variables for the engine power and number of doors?
        assertEquals(0, Double.compare(125.0, saab.getEnginePower()));
        assertEquals(2, saab.getNDoors());
        assertSame(Color.RED, saab.getColor());
        assertFalse(saab.isTurboOn());
    }

    @Test
    public void setTurboOn() {
        Saab95 saab = new Saab95();
        saab.setTurboOn();
        assertTrue(saab.isTurboOn());
    }

    @Test
    public void setTurboOff() {
        Saab95 saab = new Saab95();
        saab.setTurboOff();
        assertFalse(saab.isTurboOn());
    }

    @Test
    public void getSpeedFactor() {
        Saab95 saab = new Saab95();
        double turbo = 1;
        if (saab.isTurboOn()) {
            turbo = 1.3;
        }
        double ans = saab.getEnginePower() * 0.01 * turbo;
        assertEquals(0, Double.compare(ans, saab.getSpeedFactor()));
    }

    @Test
    public void isTurboOn() {
        Saab95 saab95 = new Saab95();
        saab95.setTurboOn();
        assertTrue(saab95.isTurboOn());
    }
}