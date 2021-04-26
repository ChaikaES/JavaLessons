package ru.geekbrains.lesson5;

public class App {
    public static void main(String[] args) {
        Employee[] stuff = new Employee[5];
        stuff[0] = new Employee("Nikolaev Roman", "manager", "nikolaev@mail.ru", "8-800-123-56-78", 24700, 42);
        stuff[1] = new Employee("Popov Oleg", "hr", "popov@mail.ru", "8-800-123-56-79", 29900, 38);
        stuff[2] = new Employee("Kruglova Svetlana", "translator", "kruglova@yandex.ru", "8-800-123-56-80", 23450, 46);
        stuff[3] = new Employee("Ovsyakov Anton", "programmer", "ovsukov@gmail.com", "8-800-123-56-81", 38600, 32);
        stuff[4] = new Employee("Strogov Mihail", "qa", "strogov@gmail.com", "8-800-123-56-81", 26890, 24);
        for (int i=0; i < stuff.length; i++) {
            if (stuff[i].getAge() > 40) {
                stuff[i].printInfo();
            }
        }
    }
}
