package lab1;

import static org.junit.Assert.*;
import org.junit.Test;

public class Saab95Test {

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

    }
}