package ru.skyeng;

import javax.swing.*;

public class Main<deliveryDistance> {

    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
        byte client1 = 1;
        int clientDiviceYear = 2014;
        if (client1 == 1 && clientDiviceYear <= 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке ");
        }
        if (client1 == 0 && clientDiviceYear >= 2015) {
            System.out.println("Установите обновленную версию приложения для Android по ссылке");
        } else {
            System.out.println("Допустимая версия");

            byte client2 = 0;
            int clientDiviceYear1 = 2014;
            if (client2 == 0 && clientDiviceYear1 <= 2015) {
                System.out.println("Установите облегченную версию для iOS по ссылке ");
            }
            if (client2 == 0 && clientDiviceYear1 >= 2015) {
                System.out.println("Установите обновленную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Допустимая версия");


            }
        }


        int year = 1991;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "-- високосный год");
        } else {
            System.out.println(year + "-- не является високосным годом");

        }


        int deliveryDistance = 85;
        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            result++;
        }
        System.out.println(" Потребуется дней " + result);

        int monthNumber = 7;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
    }
}








































