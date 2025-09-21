package com.example.demo.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test-man")
public class Welcome {

    @Value("${orrey-swamy}")
    private String property;

    public String getProperty(){
        return this.property;
    }

    @Autowired
    private Config config;

    private Logger logger = LoggerFactory.getLogger(Application.class);


    @Autowired
    UserValidation userValidation;

    @GetMapping("/login")
    public String login(Model model) {
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
        logger.info("swamy-{} and salary-{}",
                config.getSwamy(),config.getSalary());
    }
}
