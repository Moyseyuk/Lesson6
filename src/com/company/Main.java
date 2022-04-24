package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. Карты");
        System.out.println("2. Компьютер");
        System.out.println("3. Банкомат");
        System.out.print("Выберите какой пункт домашнего задания хотите проверить:");

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int scr1 = sc.nextInt();
            switch (scr1){
                case (1):
                    terminal();
                    break;
                case (2):
                    computer();
                    break;
                case (3):
                    task3();
                    break;

                default:
                    System.out.println("Выберите один из 3-х пунктов");
                    break;
            }
        } else {
            System.out.println("Извините, но вы ввели явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        int number;
        while (!sc.hasNextInt()) {
            System.out.print("Выберите из предложенного списка: ");
            sc = new Scanner(System.in);
        }
        number = sc.nextInt();
        return (number);
    }

    public static void cardInfo(CreditCard card1, CreditCard card2, CreditCard card3) {
        System.out.println();
        System.out.println("Карта №1");
        card1.cardInfo();
        System.out.println();
        System.out.println("Карта №2");
        card2.cardInfo();
        System.out.println();
        System.out.println("Карта №3");
        card3.cardInfo();
        System.out.println();
    }

    public static void cardList() {
        System.out.println("1. Карта №1");
        System.out.println("2. Карта №2");
        System.out.println("3. Карта №3");
        System.out.println("4. Вернуться к списку операций");
        System.out.print("Укажите карту, со счёта которой желаете снять средства: ");
    }

    public static void accrual(CreditCard card1, CreditCard card2, CreditCard card3) {
        System.out.println();
        int i = 0;
        while (!(i > 0 && i <= 3)) {
            cardList();
            i = inputInt();
            switch (i) {
                case (1):
                    card1.accrual();
                    break;
                case (2):
                    card2.accrual();
                    break;
                case (3):
                    card3.accrual();
                    break;
                case (4):
                    break;
                default:
                    System.out.println("Выберите одну из предложенных операций.\n");
                    break;
            }
        }
    }

    public static void withdrawal(CreditCard card1, CreditCard card2, CreditCard card3) {
        System.out.println();
        int i = 0;
        while (!(i > 0 && i <= 3)) {
            cardList();
            i = inputInt();
            switch (i) {
                case (1):
                    card1.withdrawal();
                    break;
                case (2):
                    card2.withdrawal();
                    break;
                case (3):
                    card3.withdrawal();
                    break;
                case (4):
                    break;
                default:
                    System.out.println("Выберите одну из предложенных операций.\n");
                    break;
            }
        }
    }

    public static void terminal() {
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();

        card1.setInvoiceNumber(12345678);
        card2.setInvoiceNumber(87654321);
        card3.setInvoiceNumber(13572468);

        card1.setInvoiceSum(45.62);
        card2.setInvoiceSum(685.45);
        card3.setInvoiceSum(64816.56);

        int counter = 0;
        while (counter != 4) {
            System.out.println("1. Пополнить счёт");
            System.out.println("2. Снятие наличных со счёта");
            System.out.println("3. Вывод номера счёта и баланса");
            System.out.println("4. Вернуть все карты");
            System.out.print("Выберите какую хотите совершить операцию: ");
            counter = inputInt();
            switch (counter) {
                case (1):
                    accrual(card1, card2, card3);
                    break;
                case (2):
                    withdrawal(card1, card2, card3);
                    break;
                case (3):
                    cardInfo(card1, card2, card3);
                    break;
                case (4):
                    break;
                default:
                    System.out.println("Выберите одну из предложенных операций.\n");
                    break;
            }
        }
    }

    public static void computer() {
        Computer pc1 = new Computer(200, "HP");
        System.out.println("Computer1:" + pc1);
        Computer pc2 = new Computer(350, "DELL", "DDR4", 4096, "ADATA", 500, HDD_TYPE.external);
        System.out.println("Computer2:" + pc2);
    }

    public static int banknotes(int denomination) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество купюр номиналом " + denomination + "$: ");
        int number;
        while (!sc.hasNextInt()) {
            System.out.print("Введите количество купюр номиналом " + denomination + "$: ");
            sc = new Scanner(System.in);
        }
        number = sc.nextInt();
        return (number);
    }

    public static void task3() {
        int sum = introduction();
        int getsum = cashAdvance();
        if (getsum < sum) {
            int i = 0;
            int j = 0;
            int k = 0;
            for(;getsum >= 100; getsum -= 100) {
                i++;
            }
            for(;getsum >= 50; getsum -= 50) {
                j++;
            }
            for(;getsum >= 20; getsum -= 20) {
                k++;
            }
            System.out.println("\u001B[32mУспешно!\u001B[0m");
            System.out.println("Выдано " + i + " купюр 100$, " + j + " купюр 50$, " + k + " купюр 20$");
        } else {
            System.out.println("\u001B[31mВ банкомате недотаточно средств.\u001B[0m");
        }
    }

    public static int introduction() {
        ATM atm = new ATM(banknotes(20), banknotes(50), banknotes(100));
        System.out.println(atm);
        return atm.getDennum1() * 20 + atm.getDennum2() * 50 + atm.getDennum3() * 100;
    }

    public static int cashAdvance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму которую хотите снять: ");
        int number;
        while (!sc.hasNextInt()) {
            System.out.print("Введите сумму которую хотите снять: ");
            sc = new Scanner(System.in);
        }
        number = sc.nextInt();
        return (number);
    }

}
