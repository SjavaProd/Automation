package com.OOP;

public class Sofa extends Product {
    public Sofa(Material material1, int quantityMaterial1, Material material2, int quantityMaterial2) {
        super(material1, quantityMaterial1, material2, quantityMaterial2);
    }

    public Sofa(int employees, int hoursToMake) {
        super(employees, hoursToMake);
    }

    public Sofa(int weight, double length, double width, double height) {
        super(weight, length, width, height);
    }
}
