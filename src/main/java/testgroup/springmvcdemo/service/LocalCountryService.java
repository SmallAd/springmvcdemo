package testgroup.springmvcdemo.service;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class LocalCountryService implements CountryService {

    @Override
    public Map<String, String> getCountries() {
        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        countries.put("BR", "Brazil");
        countries.put("CH", "China");
        countries.put("IN", "India");
        countries.put("RU", "Russia");
        
        return countries;
    }
    
}
