package com.postovan.zooclubservice;

public class Dog extends Animal implements AnimalInterface {
    public Dog(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(this.getName() + " eats pedigree");
    }

    public void makeSound() {
        System.out.println(getName() + " Ham, Ham!");
    }
}
