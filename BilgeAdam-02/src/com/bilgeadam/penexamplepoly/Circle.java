package com.bilgeadam.penexamplepoly;

public class Circle {
    private int radius;
    private String color;

    public Circle() {
        this.color = "Black";
    }

    public Circle(String color) {
        this.color = color;
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
