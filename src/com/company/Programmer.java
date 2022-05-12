package com.company;

public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }


    @Override
    public void learm() {
        super.learm();
        System.out.println("Учитса новаму языку програмировании");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Ходит на работу");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Любит кушать пелмени");
    }

    public void coding() {
        System.out.println("Kодирует");
    }

    @Override
    public String toString() {
        return "Programmer " +
                "companyName = " + companyName +
                ' ' + super.toString();
    }
}
