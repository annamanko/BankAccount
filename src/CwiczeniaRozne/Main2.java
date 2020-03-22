package CwiczeniaRozne;

import org.junit.jupiter.api.Test;

public class Main2 {
    @Test
    public void example() {
    int [][] planety = new int[8][2]; //tablica wielowymiarowa 8 wierszy i 2 kolumny
        planety [0][0] = 1;
        planety [0][1] = 4879;

        int[][] planety2 = {{1,4879},{2,12104}};
        System.out.println("Planeta nr" + planety2[1][0] + " średnica: " + planety2[1][1]);
        String [][] planety3 ={{"1", "Merkury"}, {"2", "Wenus"},{"3","Ziemia"}}; //tablica wielowymiarowa pierwszy argument to wiesz drugi argument to kolumna podwójne nawiasy klamrowe
        System.out.println("Planeta " + planety3[2][0]+ " " +"to: " + planety3[2][1]);

    }
}