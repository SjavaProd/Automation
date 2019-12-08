package com.OOP;

public abstract class Product {
    //first state
    private String material1;
    private int priceMaterial1;
    private int quantityMaterial1;
    private String material2;
    private int priceMaterial2;
    private int quantityMaterial2;
    //second state
    private int employees;
    private int hoursToMake;
    //third state
    private int weight;
    private double length;
    private double width;
    private double height;

    //first state calculation
    public Product(String material1, int priceMaterial1, int quantityMaterial1, String material2, int priceMaterial2, int quantityMaterial2) {
        this.material1 = material1;
        this.priceMaterial1 = priceMaterial1;
        this.quantityMaterial1 = quantityMaterial1;
        this.material2 = material2;
        this.priceMaterial2 = priceMaterial2;
        this.quantityMaterial2 = quantityMaterial2;
        System.out.println("Calculated first state:");
        System.out.println("Product{material1='" + material1 + '\'' +
                ", priceMaterial1=" + priceMaterial1 +
                ", quantityMaterial1=" + quantityMaterial1 +
                ", material2='" + material2 + '\'' +
                ", priceMaterial2=" + priceMaterial2 +
                ", quantityMaterial2=" + quantityMaterial2 + "}");
        System.out.println("Cost price is " + calcCostPrice() + " $");
        System.out.println("Products price is " + calcPrice() + " $");
    }

    public abstract int calcCostPrice();

    public abstract int calcPrice();

    //second state calculation
    public Product(int employees, int hoursToMake) {
        this.employees = employees;
        this.hoursToMake = hoursToMake;
        System.out.println("Calculated second state:");
        System.out.println("Product{employees=" + employees +
                        ", hoursToMake=" + hoursToMake + "}");
        System.out.println("Your product will be done in " + calcTime() + " days");
    }

    public abstract int calcTime();

    //third state calculation
    public Product(int weight, double length, double width, double height) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("Calculated third state:");
        System.out.println("Product{weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height + "}");
        System.out.println("Products volume is " + calcVolume() + " cubic meters");
        System.out.println("Delivery cost is " + calcDelivery() + " $");
    }

    public abstract double calcVolume();

    public abstract int calcDelivery();

    public String getMaterial1() {
        return material1;
    }

    public int getPriceMaterial1() {
        return priceMaterial1;
    }

    public int getQuantityMaterial1() {
        return quantityMaterial1;
    }

    public String getMaterial2() {
        return material2;
    }

    public int getPriceMaterial2() {
        return priceMaterial2;
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
