package com.OOP;

public class Cupboard extends Product {
    public Cupboard(Material material1, int quantityMaterial1, Material material2, int quantityMaterial2) {
        super(material1, quantityMaterial1, material2, quantityMaterial2);
    }

    public Cupboard(int employees, int hoursToMake) {
        super(employees, hoursToMake);
    }

    public Cupboard(int weight, double length, double width, double height) {
        super(weight, length, width, height);
    }
}
