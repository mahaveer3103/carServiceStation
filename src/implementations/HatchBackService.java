package implementations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HatchBackService {

    private Map<String,CarService> serviceMap = new HashMap<>();

    public HatchBackService(){
        serviceMap.put("BS01", new CarService("BS01", "Basic Service",CarType.HATCHBACK, 2000));
        serviceMap.put("EF01", new CarService("EF01", "Engine Fixing",CarType.HATCHBACK, 5000));
        serviceMap.put("CF01", new CarService("CF01", "Clutch Fixing",CarType.HATCHBACK, 2000));
        serviceMap.put("BF01", new CarService("BF01", "Break Fixing",CarType.HATCHBACK, 1000));
        serviceMap.put("GF01", new CarService("GF01", "Gear Fixing",CarType.HATCHBACK, 3000));
    }

    void printDetails(CarType carType){
        for(Map.Entry<String,CarService> details : serviceMap.entrySet()){
            System.out.println(details.getKey()+" "+details.getValue().getName()+" "+details.getValue().getPrice(carType));
        }
    }

    public CarService getService(String code) {
        return serviceMap.get(code);
    }

    public void printBill(CarType carType, List<String> serviceCodes) {
        double bill = 0;
        for (String code : serviceCodes) {
            CarService service = getService(code);
            bill += service.getPrice(carType);
            System.out.println(service.getName()+" : "+service.getPrice(carType));
        }
        if(bill>=10000) {
            System.out.println("Additionally you get a free complimentary car cleaning as your invoice bill crosses 10,000rs");
            System.out.println("Total Service Bill : " + bill );
        }else{
            System.out.println("Total Service Bill : " + bill );
        }
    }
}
