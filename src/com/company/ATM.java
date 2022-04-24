package com.company;

import java.util.Scanner;

public class ATM {
    private int dennum1 = 0;
    private int dennum2 = 0;
    private int dennum3 = 0;

     ATM(int dennum1, int dennum2, int dennum3){
         this.dennum1 = dennum1;
         this.dennum2 = dennum2;
         this.dennum3 = dennum3;
     }

    @Override
    public String toString() {
        return "ATM:" +
                "\nноминал 20$: " + dennum1 +
                "\nноминал 50$: " + dennum2 +
                "\nноминал 100$: " + dennum3;
    }

    public int getDennum1() {
        return dennum1;
    }

    public int getDennum2() {
        return dennum2;
    }

    public int getDennum3() {
        return dennum3;
    }
}
