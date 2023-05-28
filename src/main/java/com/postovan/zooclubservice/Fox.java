package com.postovan.zooclubservice;

public class Fox extends Animal implements AnimalInterface{

    public Fox(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(this.getName() + " eats chicken");
    }

    public void makeSound() {
        System.out.println(getName() + " pss, pss!");
    }
}
