package edu.model;

public class WebService {
    private String name;
    private String value;

    public WebService(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}

