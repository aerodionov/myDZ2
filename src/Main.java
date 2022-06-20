public class Main {
    public static void main(String[] args) {
        // Домашнее задание "1.3 Условные операторы"
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 2
        System.out.println("");
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        if ((clientOS == 1) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if ((clientOS == 1) && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if ((clientOS == 0) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if ((clientOS == 0) && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 3
        System.out.println("");
        System.out.println("Задание 3");
        int year = 1600;
        if (((year% 4 == 0) && (year% 100 !=0)) || (year% 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задание 4
        System.out.println("");
        System.out.println("Задание 4");
        int deliveryDistance = 19;
        int deliveryTime = 0;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
        } else {
            deliveryTime = (deliveryDistance - 20) / 40 + 2;
        }
        System.out.println("Потребуется дней: " + deliveryTime);

        //Задание 5
        System.out.println("");
        System.out.println("Задание 5");
        int monthNumber = 6;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц относится к сезону - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц относится к сезону - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц относится к сезону - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц относится к сезону - осень");
                break;

        }


    }
}