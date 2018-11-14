package lab1;

import static java.lang.Double.compare;
import static org.junit.Assert.*;

import org.junit.Test;

public class CustomVectorTest {

    @Test
    public void getX() {
        CustomVector vector = new CustomVector(3.0, 4.0);
        double expected = 3.0;
        double result = vector.getX();
        assertEquals(0, compare(expected, result));
    }

    @Test
    public void getY() {
        CustomVector vector = new CustomVector(3.0, 4.0);
        double expected = 4.0;
        double result = vector.getY();
        assertEquals(0, compare(expected, result));
    }

    @Test
    public void getLength() {
        CustomVector vector = new CustomVector(3.0, 4.0);
        double expected = 5; //square root of 25
        double result = vector.getLength();
        assertEquals(0, compare(expected, result));
    }
}