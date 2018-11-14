package lab1;

public final class CustomVector {

    private double x;
    private double y;
    private double length;

    public CustomVector(double x, double y) {
        this.x = x;
        this.y = y;
        length = VectorMath.length(x, y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getLength() {
        return length;
    }
}
