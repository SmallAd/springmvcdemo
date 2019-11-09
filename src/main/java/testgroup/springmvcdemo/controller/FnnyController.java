package testgroup.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author smallad
 */
@Controller
public class FnnyController {
    
    @RequestMapping("/showForm")
    public String showForm() {
        return "funny-form";
    }
    
}
