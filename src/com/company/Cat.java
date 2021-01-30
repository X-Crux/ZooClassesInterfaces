package com.company;

public class Cat extends Animal implements WishingZoo {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void say(){
        System.out.print("Miaauu!");
    }
}
