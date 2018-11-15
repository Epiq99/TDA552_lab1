package lab1;

/**
 * An interface to give classes the ability to both move and turn.
 */
public interface Movable {

    /**
     * Moves, i.e, updates the position of this object.
     */
    void move();

    /**
     * Changes the direction of this <code>Movable</code> by turning to
     * the right.
     *
     */
    void turnRight();

    /**
     * Changes the direction of this <code>Movable</code> by turning to
     * the left.
     *
     */
    void turnLeft();
}
