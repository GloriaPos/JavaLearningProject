package com.postovan.accessmodifiers;

import com.postovan.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person andreiBuzu = new Person(567897545346L);
        andreiBuzu.address = "Mihai Eminescu 2";
        andreiBuzu.gender = "Masculin";
        System.out.println(andreiBuzu.toString());
        Person.printNumberOfPeople();

        Person mihaiEminescu = new Person(658698007079L, "Mihai Eminescu" , false, 37);
        mihaiEminescu.address = "Veronica Micle 24";
        mihaiEminescu.gender = "Masculin";
        System.out.println(mihaiEminescu.toString());
        Person.printNumberOfPeople();

        Person vasileSchiopu = new Person(6586980887079L, "Vasile Schiopu" , true, 45);
        vasileSchiopu.gender = "Masculin";
        vasileSchiopu.address = "George Enescu 5";
        System.out.println(vasileSchiopu.toString());
        Person.printNumberOfPeople();

        Person alaDas = new Person(6586980000909L, "Ala Das" , false, 30);
        alaDas.gender = "Feminin";
        alaDas.address = "27 August 7";
        System.out.println(vasileSchiopu.toString());
        Person.printNumberOfPeople();
    }

}
