package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double HALF = 0.5;
    private double height;
    private double side;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: "
                + getArea() + "sq. units, side "
                + side + " units, height " + height
                + " units, color: " + getColor().name());
    }

    public double getArea() {
        return side * HALF * height;
    }
}
