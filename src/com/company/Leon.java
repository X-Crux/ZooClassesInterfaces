package com.company;

public class Leon extends Animal implements Exotic, Heatloving, WishingZoo {
    public Leon(String name) {
        super(name);
    }

    @Override
    public void say(){
        System.out.print("Rrraugh!");
    }
}
