package patterns.composite;

import java.util.List;

public class VehicleAssembly implements VehiclePart {
    private List<VehiclePart> parts = new java.util.ArrayList<>();

    @Override
    public double getCost() {
        double totalCost = 0.0;
        for (VehiclePart part : parts) {
            totalCost += part.getCost();
        }
        return totalCost;
    }

    public void addPart(VehiclePart part) {
        parts.add(part);
    }

    public void removePart(VehiclePart part) {
        parts.remove(part);
    }
}
