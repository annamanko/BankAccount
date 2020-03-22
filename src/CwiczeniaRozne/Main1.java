package CwiczeniaRozne;

import org.junit.jupiter.api.Test;

public class Main1 {
    @Test
    public void example() {
        int nr1 = 2;
        int nr2 = 4;
        int nr3 = 2;
        boolean warunek = nr1 == nr3;
        boolean warunek2 = nr1 != nr3;

        boolean prawda = true;
        boolean fałsz = false;

        boolean warunek3 = prawda && prawda; //koniunkcja && obie strony true aby było true
        boolean warunek4 = prawda || fałsz; //alternatywna jedna strona true aby było true
    String pierwsza = "Na śniadanie jadłam dzisiaj ";
    String druga = "jajecznicę ";
    String trzecia = "na maśle z ";
    String czwarta = " jajek";

//kontakenacja
    String test = pierwsza + druga +trzecia;
    int liczba = 8;
    String tekstZliczba = test + liczba + czwarta;
        System.out.println(tekstZliczba);
    }

}
