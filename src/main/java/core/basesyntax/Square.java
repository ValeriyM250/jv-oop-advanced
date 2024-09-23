package core.basesyntax;

public class Square extends Figure {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: "
                + getArea() + "sq. units, side "
                + side + " units, color: "
                + getColor().name());
    }

    public double getArea() {
        return side * side;
    }
}
