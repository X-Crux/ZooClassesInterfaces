package com.company;

public class Penguin extends Bird implements Exotic, Coldloving, WishingZoo {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void motion() {
        System.out.print("Я плаваю");
    }
}
