package com.company;

import java.util.Scanner;

public class CreditCard {
    private int invoiceNumber;
    private double invoiceSum;

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setInvoiceSum(double invoiceSum) {
        this.invoiceSum = invoiceSum;
    }

    public void cardInfo(){
        System.out.println("Номер карты " + this.invoiceNumber);
        System.out.println("Сумма остатка на " + this.invoiceSum);
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getInvoiceSum() {
        return invoiceSum;
    }
}
