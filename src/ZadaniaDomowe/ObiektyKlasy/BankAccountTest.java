package ZadaniaDomowe.ObiektyKlasy;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    public static void main(String[] args) {

    BankAccount myAccount = new BankAccount(13213151);
    myAccount.depositCash(1500);

        System.out.println("I have on my account: " + myAccount.printInfo());
    double withdraw = myAccount.withdrawCash(570);

        System.out.println("I paid out: " + withdraw + "I have: " + myAccount.printInfo());

        myAccount.depositCash(211);
        System.out.println("Account balance: " + myAccount.printInfo());

        BankAccount yourAccount = new BankAccount(254698745);
        yourAccount.getNumber();
        System.out.println("Your Account number: " + yourAccount.getNumber());

        yourAccount.depositCash(47854);
        System.out.println("Yoyr Account Balance: " + yourAccount.getCash());
}
}