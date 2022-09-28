package com.davidorellana;

public abstract class PersonalInformation {

    private final String name;

    public PersonalInformation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
