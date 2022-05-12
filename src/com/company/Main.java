package com.company;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer("Абдунуур", "Програмист", "Peaksoft");
        System.out.println(programmer);
        programmer.learm();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println();

        Dancer dancer = new Dancer("Эльвира", "Танцовшитса", "Гимнасты 1");
        System.out.println(dancer);
        dancer.learm();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println();

        Singer singer = new Singer("Мансур","Музыкант","Гитаристы");
        System.out.println(singer);
        singer.learm();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();
    }
}
