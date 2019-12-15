package com.OOP;

public interface Delivelable {

    default int calcCostPrice(Product product) {
        int costPrice = product.material1.getMaterialPrice() * product.quantityMaterial1 + product.material2.getMaterialPrice() * product.quantityMaterial2;
        System.out.println("The cost price of the " + product.getClass().getSimpleName() + " is: ");
        return costPrice;
    }

    default int calcPrice(int costPrice) {
        int price = costPrice * 2;
        System.out.println("The price of the product is: ");
        return price;
    }

    default int calcTime(Product product) {
        int calcTime = product.hoursToMake / product.employees / 8;
        System.out.println("Your " + product.getClass().getSimpleName() + " will be done in " + calcTime + " days");
        return calcTime;
    }

    default double calcVolume(Product product) {
        double calcVolume = product.height * product.width * product.length;
        System.out.println("Current volume of the " + product.getClass().getSimpleName() + " is: ");
        return calcVolume;
    }

    default int calcDelivery(double calcVolume, Product product) {
        if (calcVolume <= 0.1 && product.weight < 10) {
            int delivery = 0;
            System.out.println("Delivery price is " + delivery + "$");
            return delivery;
        } else if (calcVolume < 0.1 && product.weight <= 25) {
            int delivery = 10;
            System.out.println("Delivery price is " + delivery + "$");
            return delivery;
        } else if (calcVolume < 0.15 && product.weight <= 75) {
            int delivery = 20;
            System.out.println("Delivery price is " + delivery + "$");
            return delivery;
        } else if (calcVolume < 1.5 && product.weight <= 100) {
            int delivery = 30;
            System.out.println("Delivery price is " + delivery + "$");
            return delivery;
        } else if (calcVolume < 2 && product.weight <= 150) {
            int delivery = 40;
            System.out.println("Delivery price is " + delivery + "$");
            return delivery;
        }
        int delivery = 100;
        System.out.println("Delivery price is " + delivery + "$");
        return delivery;
    }

}
