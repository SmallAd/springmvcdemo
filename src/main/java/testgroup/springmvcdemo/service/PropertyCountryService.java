package testgroup.springmvcdemo.service;

import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyCountryService implements CountryService {
    
    @Value("#{countryOptions}")
    private Map<String, String> countries;
    
    @Override
    public Map<String, String> getCountries() {
        return countries;
    }
    
}
