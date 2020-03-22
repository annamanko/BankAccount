//Stwórz klasę `Car`, posiadającą następujące atrybuty:
//
//        - brand
//        - model
//        - price
//
//        Stwórz metody dostępowe do ww. atrybutów, tzw. gettery i settery.
//
//        Dopisz metodę `toString`, wyświetlającą markę oraz cenę w jednej linii.

        package Metody;

public class Car {
    private String brand;
    private String model;
    private int price;

    public void setBrand (String brand){
        this.brand = brand;
    }
    public void setModel (String model){
        this.model = model;
    }
    public void setPrice (int price){
        this.price = price;
    }
    public String toString (){
        return (this.brand + this.price);
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
