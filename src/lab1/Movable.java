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
     * Changes the direction of this <code>Movable</code> by turning one step to
     * the right.
     *
     * @see Direction
     */
    void turnRight();

    /**
     * Changes the direction of this <code>Movable</code> by turning one step to
     * the left.
     *
     * @see Direction
     */
    void turnLeft();
}
