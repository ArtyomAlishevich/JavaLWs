package org.example;

public class Month {
    String name;
    Season season;
    Month(String name, Season season) {
        this.name = name;
        this.season = season;
    }
    public String toString() {
        return name;
    }
}
