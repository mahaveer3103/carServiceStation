import implementations.CarType;
import implementations.HatchBackService;
import implementations.ServiceStation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please select car type : HATCHBACK , SEDAN , SUV ");
        String carType = sc.nextLine();
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.carType(carType);
    }
}