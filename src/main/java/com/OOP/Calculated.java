package com.OOP;

public class Calculated extends Product {

    public Calculated(String material1, int priceMaterial1, int quantityMaterial1, String material2, int priceMaterial2, int quantityMaterial2) {
        super(material1, priceMaterial1, quantityMaterial1, material2, priceMaterial2, quantityMaterial2);
    }

    public Calculated(int employees, int hoursToMake) {
        super(employees, hoursToMake);
    }

    public Calculated(int weight, double length, double width, double height) {
        super(weight, length, width, height);
    }

    public int calcCostPrice() {
        int calcPrice = getPriceMaterial1() * getQuantityMaterial1() + getPriceMaterial2() * getQuantityMaterial2();
        return calcPrice;
    }

    public int calcPrice() {
        int price = calcCostPrice() * 2;
        return price;
    }

    public int calcTime() {
        int calcTime = getHoursToMake() / getEmployees() / 8;
        return calcTime;
    }

    public double calcVolume() {
        double calcVolume = getHeight() * getWidth() * getLength();
        return calcVolume;
    }

    public int calcDelivery() {
        if (calcVolume() <= 0.1 && getWeight() < 10) {
            return 0;
        } else if (calcVolume() < 0.1 && getWeight() <= 25) {
            return 10;
        } else if (calcVolume() < 0.15 && getWeight() <= 75) {
            return 20;
        } else if (calcVolume() < 1.5 && getWeight() <= 100) {
            return 30;
        } else if (calcVolume() < 2 && getWeight() <= 150) {
            return 40;
        }
        return 100;
    }

}
