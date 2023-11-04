package patterns.adapter;

public class SpaceXEngineAdapter implements RocketComponent {
    private SpaceXEngine engine;

    public SpaceXEngineAdapter(SpaceXEngine engine) {
        this.engine = engine;
    }

    @Override
    public void operate() {
        System.out.println("SpaceX engine with " + engine.getPower() + " power is operating.");
    }
}
