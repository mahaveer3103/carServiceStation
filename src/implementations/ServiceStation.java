package implementations;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceStation {

    public void carType(String carType) {
        if (carType.equals("HATCHBACK")) {
            HatchBackService hatchBackService = new HatchBackService();
            hatchBackService.printDetails(CarType.HATCHBACK);
            ArrayList<String> codes = getServiceCode();
            hatchBackService.printBill(CarType.HATCHBACK,codes);
        } else if (carType.equals("SEDAN")) {
            SedanService sedanService = new SedanService();
            sedanService.printDetails(CarType.SEDAN);
            ArrayList<String> codes = getServiceCode();
            sedanService.printBill(CarType.SEDAN,codes);
        } else if (carType.equals("SUV")) {
            SUVService suvService = new SUVService();
            suvService.printDetails(CarType.SUV);
            ArrayList<String> codes = getServiceCode();
            suvService.printBill(CarType.SUV,codes);
        }
    }
    Scanner sc = new Scanner(System.in);
    private ArrayList<String> getServiceCode(){
        ArrayList<String> codes = new ArrayList<>();
        System.out.println("Please enter service code "+"\n"+"After selecting codes in the end enter 0");
        while (true){
            String code = sc.nextLine();
            if(code.equals("0")) {
                break;
            }
            else if(code.equals("BS01")  || code.equals("EF01") || code.equals("CF01") || code.equals("BF01") || code.equals("GF01")) {
                codes.add(code);
            }
            else {
                System.out.println("Invalid Code please enter again !");
            }
        }
        return codes;
    }



}
