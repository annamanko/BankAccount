//Utwórz klasę `Person`, dodaj w niej atrybuty:
//
//        - name
//        - surname
//        - age
//        - gender
//
//        Wszystkie atrybuty mają być prywatne.
//
//        1. Utwórz konstruktor, który przyjmie i ustawi parametry `name`, `surname`.
//        2. Utwórz konstruktor, który przyjmie i ustawi parametry `name`, `age`.
//        3. Utwórz konstruktor, który przyjmie i ustawi parametry `name`, `surname`, `age`, `gender`.
package Konstruktory;

public class Person {
    private String name;
    private String surname;
    private int age;
    private char gender;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public Person(char gender, String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
}
