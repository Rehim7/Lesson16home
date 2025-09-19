package task3;

import java.util.Scanner;

public class BankHesabi {
    private double balans;

    public BankHesabi(double balans) {
        this.balans = balans;
    }

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }

    @Override
    public String toString() {
        return "BankHesabi{" +
                "balans=" + balans +
                '}';
    }

    public void medaxilEt(double elavebalans){
        balans = balans + elavebalans;
    }

    public void mexaricEt(double menfibalans){
        balans = balans - menfibalans;
    }


}
