package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        if(food < amount){
            System.out.println("В тарелке меньше еды, чем нужно");
        }
        else {
            food -= amount;
        }
    }

    public void info() {System.out.println("Food amount: " + food);}
}
