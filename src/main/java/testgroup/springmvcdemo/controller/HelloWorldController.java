package testgroup.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author smallad
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }
    
    @RequestMapping("/processFormV2")
    public String processUpperForm(
            @RequestParam("studentName") String studentName, 
            Model model) {
        String result = "Hi! " + studentName.toUpperCase();
        model.addAttribute("message", result);
        return "helloworld";
    }
}
