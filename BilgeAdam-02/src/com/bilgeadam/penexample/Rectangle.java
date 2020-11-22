package com.bilgeadam.penexample;

public class Rectangle {
    private int width;
    private int height;
    private String color;

    public Rectangle() {
        this.color = "Blue";
    }

    public Rectangle(String color) {
        this.color = color;
    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
