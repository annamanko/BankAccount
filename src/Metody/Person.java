package Metody;

public class Person {
    private String name = "Anna";
        private String surname = "Kowalska";
        private int age = 22;
        private char gender = 'K';

        public void setName (String name) {
            this.name = name;

        }
        public void setSurname (String surname){
            this.surname = surname;
        }

        public void setAge (int age) {
            this.age = age;
                    }

        public void setGender (char gender) {
            this.gender = gender;
        }
    public void printDetails() {
        System.out.println("Imię: " + this.name);
        System.out.println("Naziwsko: " + this.surname);
        System.out.println("Wiek: " + this.age);
        System.out.println("Płeć: " + this.gender);
    }
    public String getFullName () {
return name + " " + surname;
    }
    public int increaseAge () {
            return age++;
    }

}

