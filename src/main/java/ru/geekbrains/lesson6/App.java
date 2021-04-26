package ru.geekbrains.lesson6;

public class App {
    public static void main(String[] args) {
        Cat voldemar = new Cat("Voldemar");
        Dog zhuchka = new Dog("Zhuchka");

        voldemar.run(170);
        zhuchka.run(230);

        voldemar.swim(1);
        zhuchka.swim(7);
    }

}
