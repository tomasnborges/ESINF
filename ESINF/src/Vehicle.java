public class Vehicle {

    private int VehID;
    private String VehicleType;
    private String VehicleClass;
    private String EngineConfig;
    private String Transmission;
    private String DriveWheels;
    private int Weight;

    public Vehicle(int VehID, String VehicleType, String VehicleClass, String EngineConfig, String Transmission, String DriveWheels, int Weight) {
        this.VehID = VehID;
        this.VehicleType = VehicleType;
        this.VehicleClass = VehicleClass;
        this.EngineConfig = EngineConfig;
        this.Transmission = Transmission;
        this.DriveWheels = DriveWheels;
        this.Weight = Weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VehID=" + VehID +
                ", VehicleType='" + VehicleType + '\'' +
                ", VehicleClass='" + VehicleClass + '\'' +
                ", EngineConfig='" + EngineConfig + '\'' +
                ", Transmission='" + Transmission + '\'' +
                ", DriveWheels='" + DriveWheels + '\'' +
                ", Weight=" + Weight +
                '}';
    }

}
