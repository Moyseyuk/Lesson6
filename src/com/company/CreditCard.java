package com.company;

import java.util.Scanner;

public class CreditCard {
    private int invoiceNumber;
    private double invoiceSum;

    public void accrual(){
        System.out.print("Введите сумму, которую хотите положить на счёт: ");
        double increaseSum = inputDouble();
        this.invoiceSum += increaseSum;
        System.out.println("\u001B[32mУспешно!\u001B[0m");
        System.out.println();
    }

    public void withdrawal(){
        System.out.print("Введите сумму, которую хотите снять со счёта: ");
        double reduceSum = inputDouble();
        if(reduceSum > this.invoiceSum){
            System.out.println("\u001B[31mНедотаточно средств.\u001B[0m");
            System.out.println();
        } else {
            this.invoiceSum -= reduceSum;
            System.out.println("\u001B[32mУспешно!\u001B[0m");
            System.out.println();
        }
    }

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

    public static double inputDouble(){
        Scanner sc = new Scanner(System.in);
        double number;
        while (!sc.hasNextDouble()) {
            System.out.print("Вы ввели явно не сумму, попробуйте ещё раз: ");
            sc = new Scanner(System.in);
        }
        number = sc.nextDouble();
        return (number);
    }
}
