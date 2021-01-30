package com.company;

public class Dove extends Bird implements WishingZoo {
    public Dove(String name) {
        super(name);
    }

    @Override
    public void motion() {
        System.out.print("Я летаю");
    }
}
