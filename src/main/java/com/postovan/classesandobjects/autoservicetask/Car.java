package com.postovan.classesandobjects.autoservicetask;

public class Car {
    int km;
    String gearType;
    String make;
    String model;
    int productionYear;
    double carPrice;
    String fuelType;

    Car(String make, String model, int productionYear, String fuelType) {
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.fuelType = fuelType;

        System.out.println("In urma executiei acestui constructor 4 parametri se creeaza un nou obiect despre care nu se cunostea price, gearType, km");
    }
    Car(String make, String model){
        this.make = make;
        this.model = model;
        System.out.println("A fost creata o masina despre care se cunoaste doar marca si modelul");
    }

}
