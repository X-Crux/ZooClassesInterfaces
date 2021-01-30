package com.company;

public abstract class Bird {
    private String name;
    public Bird(String name){
        this.name = name;
    }

    public abstract void motion();

    public String getName(){
        return name;
    }
}
