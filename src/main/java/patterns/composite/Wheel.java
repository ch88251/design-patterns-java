package patterns.composite;

public class Wheel implements VehiclePart {
    private double cost;

    public Wheel(double cost) {
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
