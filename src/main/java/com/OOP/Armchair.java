package com.OOP;

public class Armchair extends Calculated {
    public Armchair(String material1, int priceMaterial1, int quantityMaterial1, String material2, int priceMaterial2, int quantityMaterial2) {
        super(material1, priceMaterial1, quantityMaterial1, material2, priceMaterial2, quantityMaterial2);
    }

    public Armchair(int employees, int hoursToMake) {
        super(employees, hoursToMake);
    }

    public Armchair(int weight, double length, double width, double height) {
        super(weight, length, width, height);
    }
}