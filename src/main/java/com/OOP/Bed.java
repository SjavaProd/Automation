package com.OOP;

public class Bed extends Product {
    public Bed(Material material1, int quantityMaterial1, Material material2, int quantityMaterial2) {
        super(material1, quantityMaterial1, material2, quantityMaterial2);
    }

    public Bed(int employees, int hoursToMake) {
        super(employees, hoursToMake);
    }

    public Bed(int weight, double length, double width, double height) {
        super(weight, length, width, height);
    }
}
