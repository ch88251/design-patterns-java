package patterns.composite;

public class Stereo implements VehiclePart {
    private final double cost;

    public Stereo(double cost) {
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
