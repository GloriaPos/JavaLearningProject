package com.postovan.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal charlieDog = new Dog ("Charlie");

        System.out.println("Numele obiectului charlieDog este:" + charlieDog.getName());
        charlieDog.setName("Charlie Vaccined");
        System.out.println("Numele actualizat a lui charlieDog este:" + charlieDog.getName());

        charlieDog.eat();

        AnimalInterface rexDog = new Dog("The dog Rex");
        rexDog.makeSound();

        Dog zikDog = new Dog("The dog Zik");
        zikDog.eat();
        zikDog.makeSound();

        Cat mitzaCat = new Cat("The cat Mitza");
        mitzaCat.eat();
        mitzaCat.makeSound();

        Fox donFox= new Fox("The fox Don");
        donFox.eat();
        donFox.makeSound();
    }
}
