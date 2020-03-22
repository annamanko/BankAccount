//W pliku `Main2.java`, w metodzie `main`, utwórz obiekt klasy `AccessModifier` o nazwie `testAttribute`,
//        a następnie ustaw i wyświetl wszystkie wartości, które są możliwe do ustawienia.

        package Atrybuty;

public class Main2 {
    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();

        System.out.println(testAttribute.publicAttribute);
        // System.out.println(testAttribute.private.Attribute); PrivateAttribute nie może być użyty
        System.out.println(testAttribute.protectedAttribute);

    }
}
