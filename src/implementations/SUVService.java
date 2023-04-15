package implementations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SUVService {

    private Map<String,CarService> serviceMap = new HashMap<>();

    public SUVService(){
        serviceMap.put("BS01", new CarService("BS01", "Basic Service",CarType.SUV, 5000 ));
        serviceMap.put("EF01", new CarService("EF01", "Engine Fixing",CarType.SUV, 10000));
        serviceMap.put("CF01", new CarService("CF01", "Clutch Fixing",CarType.SUV, 6000));
        serviceMap.put("BF01", new CarService("BF01", "Break Fixing",CarType.SUV, 2500));
        serviceMap.put("GF01", new CarService("GF01", "Gear Fixing",CarType.SUV, 8000));
    }

    public CarService getService(String code) {
        return serviceMap.get(code);
    }

    void printDetails(CarType carType){
        for(Map.Entry<String,CarService> details : serviceMap.entrySet()){
            System.out.println(details.getKey()+" "+details.getValue().getName()+" "+details.getValue().getPrice(carType));
        }
    }

    public void printBill(CarType carType, List<String> serviceCodes) {
        double bill = 0;
        for (String code : serviceCodes) {
            CarService service = getService(code);
            bill += service.getPrice(carType);
            System.out.println(service.getName()+" : "+service.getPrice(carType));
        }
        if(bill>=10000) {
            System.out.println("In Additional You Get a FREE Car Cleaning ");
            System.out.println("Total Service Bill : " + bill );
        }else{
            System.out.println("Total Service Bill : " + bill );
        }
    }
}
