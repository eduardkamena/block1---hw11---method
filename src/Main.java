import java.time.LocalDate;

public class Main {
    public static void calculateLeapYear(int year) {
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void identifyOS(int clientOS, int phoneYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && phoneYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && phoneYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && phoneYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && phoneYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Данный телефон не поддерживается, но мы уже работаем на этим)");
        }
    }
    public static void printDeliveryMessage(int deliveryDays) {
        System.out.println("Потребуется дней: " + deliveryDays);
    }
    public static int identifyDeliveryDays(int distance) {
        int deliveryDays = 0; // Можно было начать с 1, но сделал с 0
        if (distance < 20) {
            deliveryDays += 1;
            printDeliveryMessage(deliveryDays);
        } else if (distance >= 20 && distance <= 60) {
            deliveryDays += 2;
            printDeliveryMessage(deliveryDays);
        } else if (distance > 60 && distance <= 100) {
            deliveryDays += 3;
            printDeliveryMessage(deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
        return deliveryDays;
    }
    public static void main(String[] args) {

        // Task 1:
        System.out.println("Task 1:");
        calculateLeapYear(2024);

        // Task 2:
        System.out.println("Task 2:");
        identifyOS(1, 2024);

        // Task 3:
        System.out.println("Task 3:");
        identifyDeliveryDays(80);
    }
}