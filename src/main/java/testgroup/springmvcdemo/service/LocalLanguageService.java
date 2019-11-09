package testgroup.springmvcdemo.service;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class LocalLanguageService implements LanguageService {

    @Override
    public Map<String, String> getLanguages() {
        LinkedHashMap<String, String> languages = new LinkedHashMap<>();
        languages.put("Java", "Java");
        languages.put("C#", "C#");
        languages.put("PHP", "PHP");
        languages.put("Ruby", "Ruby");
        languages.put("Python", "Python");
        return languages;
                
    }
    
}
