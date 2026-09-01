package World;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Country {
    static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "New Delhi");
        countryMap.put("China", "Beijing");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("SriLanka", "Colombo");
        countryMap.put("Bangladesh", "Dhaka");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your country name: ");
        String country = sc.next();
        if(countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s", country, countryMap.get(country));
        }else{
            System.out.printf("Sorry, i couldn't find it");
        }
    }
}
