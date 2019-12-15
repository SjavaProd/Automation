package com.OOP;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair(Material.LEATHER, 2, Material.STEEL, 5);
        int price = chair.calcCostPrice(chair);
        int storePrice = chair.calcPrice(price);
        System.out.println(price);
        System.out.println(storePrice);
        Armchair armchair = new Armchair(2, 32);
        int hours = armchair.calcTime(armchair);
        System.out.println(hours);
        Bed bed = new Bed(120, 1.5, 2, 0.4);
        double volume = bed.calcVolume(bed);
        int delivery = bed.calcDelivery(volume, bed);
        System.out.println(volume);
        System.out.println(delivery);
    }
}
