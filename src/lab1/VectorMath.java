package lab1;

import static java.lang.Math.PI;
import static java.lang.Math.atan;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;

/**
 * A utility class that provides methods to perform vector calculations.
 */
public final class VectorMath {

    //https://gamedev.stackexchange.com/questions/103811/java-game-how-to-make-image-follow-line

    private VectorMath() {}

    /**
     * Returns the length of a vector, according to: length = √(x² + y²)
     *
     * @param x the size of the x-axis component of the vector.
     * @param y the size of the y-axis component of the vector.
     * @return the resulting length as a <code>double</code>.
     * @see <a href="http://chortle.ccsu.edu/vectorlessons/vch04/vch04_4.html">
     * http://chortle.ccsu.edu</a>
     */
    public static double length(double x, double y) {
        return sqrt((x * x) + (y * y));
    }

    /**
     * Returns the distance between two vectors, represented as instances
     * of <code>CustomVector</code>. This method uses the <code>length()</code> method found
     * in the <code>VectorMatch</code> class to perform the calculations.
     *
     * @param start the first <code>CustomVector</code>.
     * @param end   the second <code>CustomVector</code>.
     * @return the distance between the two vectors, represented by a <code>double</code>.
     * @see CustomVector
     */
    public static double distance(CustomVector start, CustomVector end) {
        double x = (end.getX() - start.getX());
        double y = (end.getY() - start.getY());
        return length(x, y);
    }

    /**
     * Returns the angle of the specified <code>CustomVector</code>.
     *
     * @param vector the <code>CustomVector</code> to determine the angle of.
     * @return the angle of the <code>CustomVector</code>, represented by an <code>int</code>.
     * @see <a href="http://chortle.ccsu.edu/vectorlessons/vch05/vch05_3.html">
     * http://chortle.ccsu.edu</a>
     */
    public static int angle(CustomVector vector) {
        double slope = vector.getY() / vector.getX();
        double radians = atan(slope);
        double degrees = radians * (180.0 / PI);

        double vx = vector.getX();
        double vy = vector.getY();
//        boolean firstQuadrant = vx >= 0 && vy >= 0;
        boolean secondQuadrant = vx < 0 && vy >= 0;
        boolean thirdQuadrant = vx < 0 && vy < 0;
        boolean fourthQuadrant = vx > 0 && vy < 0;

        int comp;
        if (secondQuadrant || thirdQuadrant) {
            comp = 180;
        } else if (fourthQuadrant) {
            comp = 360;
        } else {
            comp = 0; //first quadrant
        }
        degrees += comp;
        return (int) round(degrees);
    }
}