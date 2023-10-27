import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

abstract class ReadFromCSV {

    static List<Vehicle> readVehicles(String fileName) {

        List<List<String>> list = new ArrayList<>();
        List<Vehicle> VehiclesList = new ArrayList<>();
        Scanner scanner;

        try {
            scanner = new Scanner(new File(fileName));
            while(scanner.hasNext()) {
                list.add(Arrays.asList(scanner.nextLine().split(",",-1)));
            }

        } catch(IOException ioe){
            ioe.printStackTrace();
        }

        for(int i = 1; i < list.size(); i++) {
            int VehID = Integer.parseInt(list.get(i).get(0));
            String VehicleType = list.get(i).get(1);
            String VehicleClass = list.get(i).get(2);
            String EngineConfig = list.get(i).get(3);
            String Transmission = list.get(i).get(4);
            String DriveWheels = list.get(i).get(5);

            int Weight = 0;
            String WeightRaw = list.get(i).get(6);
            if(!WeightRaw.equals("NO DATA"))
                Weight = Integer.parseInt(list.get(i).get(6));

            VehiclesList.add(new Vehicle(VehID, VehicleType, VehicleClass, EngineConfig, Transmission, DriveWheels, Weight));
        }
        return VehiclesList;
    }

}
