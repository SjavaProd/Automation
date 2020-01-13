package com.TicTacToe;

public enum Status {
    FIRST("Неправильный ввод"),
    SECOND("Правильный ввод, некорректный статус"),
    THIRD("Корректный статус, игра закончена - ничья"),
    FOURTH("Корректный статус, игра закончена, крестики выиграли"),
    FIFTH("Корректный статус, игра закончена, нолики выиграли"),
    SIXTH("Корректный статус, игра продолжается, крестики ходят"),
    SEVENTH("Корректный статус, игра продолжается, нолики ходят");

    Status(String statusValue){
        this.statusValue = statusValue;
    }

    private String statusValue;

    public String getStatusValue() {
        return statusValue;
    }
}
