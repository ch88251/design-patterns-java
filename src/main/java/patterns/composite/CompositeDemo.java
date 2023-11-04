package patterns.composite;

public class CompositeDemo {

    public static void main(String[] args) {
        VehiclePart engine = new Engine(1000);
        VehiclePart wheel = new Wheel(200);
        VehiclePart wheel2 = new Wheel(200);
        VehiclePart wheel3 = new Wheel(200);
        VehiclePart wheel4 = new Wheel(200);
        VehiclePart chassis = new Chassis(500);
        VehicleAssembly vehicle = new VehicleAssembly();
        vehicle.addPart(engine);
        vehicle.addPart(wheel);
        vehicle.addPart(wheel2);
        vehicle.addPart(wheel3);
        vehicle.addPart(wheel4);
        vehicle.addPart(chassis);
        System.out.println("Total cost: " + vehicle.getCost());
    }

}
