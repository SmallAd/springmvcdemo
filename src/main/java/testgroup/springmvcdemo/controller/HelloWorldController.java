package testgroup.springmvcdemo.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String processUpperForm(HttpServletRequest request, Model model) {
        String studentName = request.getParameter("studentName");
        String result = "Hi! " + studentName.toUpperCase();
        model.addAttribute("message", result);
        return "helloworld";
    }
}
