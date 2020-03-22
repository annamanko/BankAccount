package CwiczeniaRozne;

import org.junit.jupiter.api.Test;

public class Main3 {
    public static void main(String[] args) {

    }
    @Test
//    Jeden warunek if i else
//    public void example() {
//        int nr1 = 188;
//        if (nr1 > 100) {
//             System.out.println("Liczba " + nr1 + "jest większa od 100");
//            nr1++;
//        }
//        else{
//            System.out.println("Liczba " + nr1 + "jest mniejsza od 100");
//        nr1 = 100;
//        }
//        System.out.println("Nowa liczba to: " + nr1);
// }
    // Warunek if if else i else
//    public void example() {
//        int nr2 = -188;
//        if (nr2 > 100) {
//            System.out.println("Liczba " + nr2 + "jest większa od 100");
//            nr2++;
//        }
//        else if (nr2 >= 0 && nr2 <= 100) {
//            System.out.println("Liczba " + nr2 + "jest mniejsza od 100");
//            nr2 = 100;
//        }
//        else System.out.println("Liczba" + nr2 + "jest liczbą ujemną");
//    }
   //warunek if ifelse i else i dodatkowo if w if
    public void example() {
        int nr2 = 97;
        if (nr2 > 100) {
            System.out.println("Liczba " + nr2 + "jest większa od 100");
            nr2++;
        }
        else if (nr2 >= 0 && nr2 <= 100) {
            if (nr2==100) System.out.println("Liczba nr2 jest równa 100!");
            if (nr2!=100) System.out.println("Nie jest tak różowo");
            System.out.println("Liczba " + nr2 + "nie jest większa od 100");
            nr2 = 100;
        }
        else System.out.println("Liczba" + nr2 + "jest liczbą ujemną");
//instrukcja switch po każdym case koniecznie break
        int nr3 = 35;
        switch (nr3){
            case 10:
                System.out.println("Nr3 to 10");
                break;
            case 14:
                System.out.println("Szukana liczba to 14");
            break;
                case 22:
                System.out.println("Nasza liczba to 22");
            break;
                default:
                System.out.println("Nie znaleźliśmy liczby");
        }
    }

}