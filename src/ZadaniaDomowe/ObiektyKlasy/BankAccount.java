package ZadaniaDomowe.ObiektyKlasy;

public class BankAccount {
    private int number;
    private double cash;

    public BankAccount(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getCash() {
        return cash;
    }

    public void depositCash(double amount) {
        if (amount > 0) {
            this.cash = cash + amount;
        }
    }

    public double withdrawCash(double amount) {
                double result;
                if (amount >= 0){
                    if (cash < amount) {
                        result = cash;
                    } else {
                        result = amount;
                    }
                        } else {
                            result = 0;
                        }
                        cash -= result;
                     return result;
                    }
    public String printInfo() {
        return String.format("Numer konta : %d, Ilość gotówki: %f", this.number, this.cash);
    }


    }
