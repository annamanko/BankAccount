package Dziedziczenie;

public class BasePage {
    String title;
    String url;
    String userName;

     void idz (String pageUrl){
        System.out.println("Przechodzimy na stronę");
    }

    void SearchProduct (String product) {
        System.out.println("Szukamy produkt" + product);

    }

}
