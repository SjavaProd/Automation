package com.homework1;

public class Task3 {
    public static void main(String[] args) {
        int number = getNumber();
        String finger = getFingerNumber(number);
        System.out.println(finger);
    }

    private static int getNumber() {
        return 3;
    }

    private static String getFingerNumber(int getNumber) {
        switch (getNumber) {
            case 1:
            case 10:
                return "Thumb";
            case 2:
            case 9:
                return "Fore finger";
            case 3:
            case 8:
                return "Middle finger";
            case 4:
            case 7:
                return "Ring finger";
            case 5:
            case 6:
                return "Little finger";
            default:
                return null;
        }
    }

}
