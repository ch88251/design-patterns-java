package patterns.adapter;

public class RocketSimulation {
    public static void main(String[] args) {
        SpaceXEngine engine = new SpaceXEngine(100);
        BlueOriginBooster booster = new BlueOriginBooster(200);
        RocketComponent engineAdapter = new SpaceXEngineAdapter(engine);
        RocketComponent boosterAdapter = new BlueOriginBoosterAdapter(booster);
        simulateLaunch(engineAdapter);
        simulateLaunch(boosterAdapter);
    }

    private static void simulateLaunch(RocketComponent component) {
        component.operate();
    }
}
