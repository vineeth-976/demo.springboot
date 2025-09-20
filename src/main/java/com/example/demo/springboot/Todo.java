package com.example.demo.springboot;

import java.util.Objects;

public class Todo {
    private int id;
    private String name;
    private String location;

    public Todo() {
    }

    public Todo(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // same reference
        if (o == null || getClass() != o.getClass()) return false;

        Todo todo = (Todo) o;
        return Objects.equals(id, todo.id); // compare by primary key
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
