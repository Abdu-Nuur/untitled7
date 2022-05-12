package com.company;

public class Dancer extends Person {

    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    @Override
    public void learm() {
        super.learm();
        System.out.println("Учитса танцевать");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Ходит на танцы");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Любит кущать кашу");
    }

    public void dancing() {
        System.out.println("Танцует");
    }

    @Override
    public String toString() {
        return "Dancer " +
                "groupName = " + groupName + '\'' +
                ' ' + super.toString();
    }
}
