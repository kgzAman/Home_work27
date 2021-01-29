package com.company;

public class Actor {
    private String fullName;
    private String role;

    @Override
    public String toString() {
        return "\nActor\n{\n\t" +
                "fullName='" + fullName + '\'' +
                ",\n\trole='" + role + '\'' +
                '}';
    }
}
