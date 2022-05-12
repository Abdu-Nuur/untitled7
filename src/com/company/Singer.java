package com.company;

public class Singer extends Person {

    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    @Override
    public void learm() {
        super.learm();
        System.out.println("Учитса новым нотам гитары");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Ходит на гитариста");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Любит кушать гамбургер");
    }

    public void singing() {
        System.out.println("Поёт");
    }

    public void playGitar() {
        System.out.println("Хорошо играет на гитаре");
    }

    @Override
    public String toString() {
        return "Singer " +
                "bandName = " + bandName +
                ' ' + super.toString();
    }
}
