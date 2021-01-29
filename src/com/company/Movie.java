package com.company;

import java.util.List;

public class Movie {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Actor> cast;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getCast() {
        return cast;
    }

    @Override
    public String toString() {
        return "\nMovie{" +
                "\n\tname='" + name + '\'' +
                ",\n\tyear=" + year +
                ",\n\tdescription='" + description + '\'' +
                ",\ndirector=" + director +
                ",\n\tcast=" + cast +
                "\n}";
    }
}
