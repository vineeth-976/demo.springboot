package com.example.demo.springboot;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("orrey")
public class Config {
    private String swamy;
    private int salary;

    public Config() {
    }

    public Config(String swamy, int salary) {
        this.swamy = swamy;
        this.salary = salary;
    }

    public String getSwamy() {
        return swamy;
    }

    public void setSwamy(String swamy) {
        this.swamy = swamy;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Config{" +
                "swamy='" + swamy + '\'' +
                ", salary=" + salary +
                '}';
    }
}
