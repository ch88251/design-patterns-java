package patterns.adapter;

public class SpaceXEngine {
    private final int power;

    public SpaceXEngine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
