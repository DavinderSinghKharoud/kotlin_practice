package com;

public class Animal {
    private final String name;
    private final String kind;
    private int weight;

    public String show() {
        return name + " " + kind + " " + weight;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Animal(String name, String kind, int weight) {
        this.name = name;
        this.kind = kind;
        this.weight = weight;
    }
}
