package testgroup.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author smallad
 */
@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String showMyPage() {
        return "main-menu";
    }
    
}
