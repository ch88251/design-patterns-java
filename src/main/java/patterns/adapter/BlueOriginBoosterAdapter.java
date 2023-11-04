package patterns.adapter;

public class BlueOriginBoosterAdapter implements RocketComponent {
    private final BlueOriginBooster booster;

    public BlueOriginBoosterAdapter(BlueOriginBooster booster) {
        this.booster = booster;
    }

    @Override
    public void operate() {
        System.out.println("Blue Origin booster with " + booster.getPower() + " power is operating.");
    }
}
