package com.company;

public abstract class Aviary {
    private Exotic being;
    private int number;
    public Aviary(Exotic being, Integer number) {
        this.being = being;
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
}
