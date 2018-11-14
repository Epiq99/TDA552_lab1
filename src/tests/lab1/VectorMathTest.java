package lab1;

import static java.lang.Double.compare;
import static java.lang.Math.sqrt;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VectorMathTest {

    @Test
    public void length() {
        double x = 6.0;
        double y = 8.0;
        double expected = 10.0;
        double result = VectorMath.length(x, y);
        assertEquals(0, compare(expected, result));
    }

    @Test
    public void distance() {
        CustomVector v1 = new CustomVector(4, 2);
        CustomVector v2 = new CustomVector(8, 3);
        double expected = sqrt(17);
        double result = VectorMath.distance(v1, v2);
        assertEquals(0, compare(expected, result));
    }

    @Test
    public void angle() {
        CustomVector vector = new CustomVector(4, 4);
        int expected = 45;
        int result = VectorMath.angle(vector);
        assertEquals(expected, result);

        vector = new CustomVector(-4, 4);
        expected = 135;
        result = VectorMath.angle(vector);
        assertEquals(expected, result);

        vector = new CustomVector(-4, -4);
        expected = 225;
        result = VectorMath.angle(vector);
        assertEquals(expected, result);

        vector = new CustomVector(4, -4);
        expected = 315;
        result = VectorMath.angle(vector);
        assertEquals(expected, result);
    }
}