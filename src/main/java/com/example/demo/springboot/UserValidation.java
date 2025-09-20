package com.example.demo.springboot;

import org.springframework.stereotype.Component;

@Component
public class UserValidation {

    public boolean validate(String name, String password) {
        if (name.equalsIgnoreCase("Vineeth") &&
                password.equals("Vineeth")) {
            return true;
        }
        return false;
    }
}
