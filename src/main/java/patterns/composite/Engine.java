package patterns.composite;

public class Engine implements VehiclePart {
    private double cost;

    public Engine(double cost) {
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
