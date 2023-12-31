package patterns.composite;

public class Chassis implements VehiclePart {
    private final double cost;

    public Chassis(double cost) {
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
