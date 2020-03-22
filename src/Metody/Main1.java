//
//        W pliku `Main1.java` umieść w metodzie `main` kod, który utworzy obiekt klasy `Person` o nazwie `person`, a następnie
//        ustawi za pomocą wcześniej utworzonych metod wszystkie atrybuty klasy.
package Metody;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Maria");
        person.setSurname("Oska");
        person.setAge(35);
        person.setGender('K');

       // person.printDetails();

        System.out.println(person.getFullName());
        System.out.println(person.increaseAge());
    }



}
