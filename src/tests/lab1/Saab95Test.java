package lab1;

import static org.junit.Assert.*;

import org.junit.Test;
import java.awt.*;

public class Saab95Test {

    @Test
    public void Saab95() {
        Car saab = new Saab95();
        assertEquals("Saab95", saab.getModelName());
        assertEquals(0, Double.compare(125.0, saab.getEnginePower()));
        assertEquals( 2, saab.getNDoors());
        assertTrue(Color.RED == saab.getColor());
        assertFalse(((Saab95) saab).isTurboOn());
    }

    @Test
    public void setTurboOn() {
        Car saab = new Saab95();
        ((Saab95) saab).setTurboOn();
        assertTrue(((Saab95) saab).isTurboOn());
    }

    @Test
    public void setTurboOff() {
        Car saab = new Saab95();
        ((Saab95) saab).setTurboOff();
        assertFalse(((Saab95) saab).isTurboOn());
    }

    @Test
    public void getSpeedFactor() {
        Car saab = new Saab95();
        double turbo = 1;
        if (((Saab95) saab).isTurboOn()) {
            turbo = 1.3;
        }
        double ans = saab.getEnginePower() * 0.01 * turbo;
        assertEquals(0, Double.compare(ans, saab.getSpeedFactor()));
    }

    @Test
    public void isTurboOn() {
        Saab95 saab95 = new Saab95();
        saab95.setTurboOn();
        assertTrue(true == saab95.isTurboOn());
    }
}