//W pliku `Main3.java`, w metodzie `main`, utwórz obiekt klasy `Person` o nazwie `person`,
//        a następnie wyświetl kolejno atrybuty klasy (name, surname, age, gender).
package Atrybuty;

public class Main3 {
    public static void main(String[] args) {
        Person person = new Person ();
        System.out.println("Pierwsza osoba:");
        System.out.println("Imię: " + person.name);
        System.out.println("Nazwisko: " + person.surname);
        System.out.println("Wiek: " + person.age);
        System.out.println("Płeć: " + person.gender);
        Person jan = new Person();
        jan.name = "Jan";
        jan.surname = "Nowak";
        jan.age = 32;
        jan.gender = 'M';
        System.out.println("");
        System.out.println("Druga osoba:");
        System.out.println("Imię: " + jan.name);
        System.out.println("Nazwisko: " + jan.surname);
        System.out.println("Wiek: " + jan.age);
        System.out.println("Płeć: " + jan.gender);
    }

}
