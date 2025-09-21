package com.example.demo.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@SessionAttributes("name")
public class Welcome {

    private Logger logger = LoggerFactory.getLogger(Application.class);


    @Autowired
    UserValidation userValidation;

    @GetMapping("/login")
    public String login(Model model) {
//        model.addAttribute("name", getLoggedInUserName());
//        model.addAttribute("password", password);
        return "logging";
    }

    @PostMapping("/login")
    public String validateAndLogin(Model model, @RequestParam String name,
                                   @RequestParam String password) {
        boolean result = userValidation.validate(name, password);

        if (result == true) {
            model.addAttribute("name", name);
            model.addAttribute("password", password);
            return "welcome";
        } else {
            model.addAttribute("errorMessage",
                    "Invalid Creds bro !!");
            return "logging";
        }
    }

    @GetMapping("/doneAfter")
    @ResponseBody
    public void doneAfter(Model model) {
        logger.info("val-{} and val-{}",
                model.getAttribute("name"),
                model.getAttribute("password"));

    }
}
