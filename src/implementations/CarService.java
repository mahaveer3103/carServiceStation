package implementations;

import java.util.HashMap;
import java.util.Map;

public class CarService {

    private String code;
    private String serviceName;
    private Map<CarType,Integer> servicePrice = new HashMap<>();

    CarService(String code,String serviceName,CarType carType,Integer carPrice){
        this.code = code;
        this.serviceName = serviceName;
        this.servicePrice.put(carType,carPrice);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return serviceName;
    }

    public int getPrice(CarType carType) {
        return this.servicePrice.get(carType);
    }

}
