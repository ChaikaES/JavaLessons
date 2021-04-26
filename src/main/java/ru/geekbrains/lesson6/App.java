package ru.geekbrains.lesson6;

public class App {
    public static void main(String[] args) {
        Cat voldemar = new Cat("Voldemar");
        Dog zhuchka = new Dog("Zhuchka");

        voldemar.run(170);
        voldemar.run(208);
        zhuchka.run(509);
        zhuchka.run(230);

        voldemar.swim(1);
        zhuchka.swim(7);
        zhuchka.swim(11);
    }
}
