package com.OOP;

public class Product implements Delivelable {
    //first state
    public Material material1;
    public int quantityMaterial1;
    public Material material2;
    public int quantityMaterial2;
    //second state
    public int employees;
    public int hoursToMake;
    //third state
    public int weight;
    public double length;
    public double width;
    public double height;

    //first state calculation
    public Product(Material material1, int quantityMaterial1, Material material2, int quantityMaterial2) {
        this.material1 = material1;
        this.quantityMaterial1 = quantityMaterial1;
        this.material2 = material2;
        this.quantityMaterial2 = quantityMaterial2;
        System.out.println("Product{material1='" + material1 + '\'' +
                ", priceMaterial1=" + material1.getMaterialPrice() +
                ", quantityMaterial1=" + quantityMaterial1 +
                ", material2='" + material2 + '\'' +
                ", priceMaterial2=" + material2.getMaterialPrice() +
                ", quantityMaterial2=" + quantityMaterial2 + "}");
    }

    //second state calculation
    public Product(int employees, int hoursToMake) {
        this.employees = employees;
        this.hoursToMake = hoursToMake;
        System.out.println("Product{employees=" + employees +
                ", hoursToMake=" + hoursToMake + "}");
    }

    //third state calculation
    public Product(int weight, double length, double width, double height) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("Product{weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height + "}");
    }

    public Material getMaterial1() {
        return material1;
    }

    public int getQuantityMaterial1() {
        return quantityMaterial1;
    }

    public Material getMaterial2() {
        return material2;
    }

    public int getQuantityMaterial2() {
        return quantityMaterial2;
    }

    public int getEmployees() {
        return employees;
    }

    public int getHoursToMake() {
        return hoursToMake;
    }

    public int getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}
