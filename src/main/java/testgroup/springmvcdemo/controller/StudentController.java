package testgroup.springmvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import testgroup.springmvcdemo.model.Student;
import testgroup.springmvcdemo.service.CountryService;
import testgroup.springmvcdemo.service.LanguageService;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    private CountryService countryService;
    private LanguageService languageService;

    @Autowired
    @Qualifier(value = "propertyCountryService")
    public void setCountryService(CountryService countryService) {
        this.countryService = countryService;
    }

    @Autowired
    public void setLanguageService(LanguageService languageService) {
        this.languageService = languageService;
    }
    
    @RequestMapping("/showForm")
    public String showForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("counties", countryService.getCountries());
        model.addAttribute("languages", languageService.getLanguages());

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {

        System.out.println(student);
        return "student-confirmation";
    }

}
