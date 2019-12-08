package com.OOP;

public class Chair extends Calculated{
    public Chair(String material1, int priceMaterial1, int quantityMaterial1, String material2, int priceMaterial2, int quantityMaterial2) {
        super(material1, priceMaterial1, quantityMaterial1, material2, priceMaterial2, quantityMaterial2);
    }

    public Chair(int employees, int hoursToMake) {
        super(employees, hoursToMake);
    }

    public Chair(int weight, double length, double width, double height) {
        super(weight, length, width, height);
    }
}
