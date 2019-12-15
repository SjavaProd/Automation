package com.OOP;

public enum Material {
    STEEL(40), WOOD(10), PLASTIK(20), TEXTILE(30), LEATHER(50);

    Material(int materialPrice){
        this.materialPrice=materialPrice;
    }

    private int materialPrice;

    public int getMaterialPrice(){
        return materialPrice;
    }

}
