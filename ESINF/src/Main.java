import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Vehicle> VehicleList;
        System.out.println("Diretório de Trabalho Atual: " + System.getProperty("user.dir"));
        VehicleList = ReadFromCSV.readVehicles("files/VED_Static_Data_ICE&HEV.csv");

        for(Vehicle a : VehicleList) {
			System.out.println(a.toString());
		}

    }
}