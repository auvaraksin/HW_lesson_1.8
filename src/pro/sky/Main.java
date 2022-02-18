package pro.sky;

import java.time.LocalDate;

public class Main {

    //task 1
    public static void checkYearType(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не является високосным годом.");
        }
    }

    //task 2
    public static void checkSoftwareVersion(byte indexOS, int year) {
        String typeOS = "";
        if (indexOS == 0) {
            typeOS += "iOS";
        } else {
            typeOS += "Android";
        }
        if (year < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для " + typeOS + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + typeOS + " по ссылке");
        }
    }

    //task 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
        } else {
            deliveryDays = (deliveryDistance + 20) / 40 + 1;
        }
        return deliveryDays;
    }

    //task 4
    public static void searchDoubleLetters(String word) {
        char[] wordSplitted = word.toCharArray();
        int i = 1;
        while (i < wordSplitted.length) {
            if (wordSplitted[i] == wordSplitted[i - 1]) {
                System.out.println("В исходной строке символов имеется дубль. Дублирующий символ: " + wordSplitted[i]);
                break;
            } else {
                i++;
            }
            if (i == wordSplitted.length) {
                System.out.println("В исходной строке символов дубль отсутствует");
            }
        }
    }

    //task 5
    public static void reverseArray (int[] array) {
        int exchange;
        System.out.println("Преобразованный массив");
        for (int i = 0; i < array.length / 2; i++) {
            exchange = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = exchange;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Домашнее задание к уроку 1.8 Методы");
        System.out.println("Задание 1");
        int year = 2021;
        checkYearType(year);
        System.out.println("Задание 2");
        byte indexOS = 0;
        checkSoftwareVersion(indexOS, year);
        System.out.println("Задание 3");
        int deliveryDistance = 219;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Срок доставки банковской карты (дней): " + deliveryDays);
        System.out.println("Задание 4");
        String word = "aabccddefgghiijjkk";
        System.out.println("Исходная строка символов: " + word);
        searchDoubleLetters(word);
        System.out.println("Задание 5");
        int[] array = {5, 4, 3, 2, 1};
        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        reverseArray(array);
        System.out.println();
    }
}
