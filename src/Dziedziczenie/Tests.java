package Dziedziczenie;

import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void productPriceTest (){
        ProductPage productPage = new ProductPage();
        productPage.idz ("jakis url");
        String price = productPage.productPrice;

    }
}
