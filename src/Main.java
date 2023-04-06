public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }


    public static void task1() {

        System.out.println("Задача 1");

        // Пишем код для задачи 1

        int savingsPerMonths = 15000;
        int totalSavings = 2_459_000;
        int months = 0;
        int currentSavings = 0;
        while (currentSavings < totalSavings) {
            currentSavings = currentSavings + savingsPerMonths;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений  " + currentSavings + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        // Пишем код для задачи 2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");
        for (i = 10; i >= 1; i--) {

            System.out.print(i + " ");


        }
        System.out.println("\n");
    }

    public static void task3() {
        System.out.println("Задача 3");

        // Пишем код для задачи 3
        int population = 12_000_000;
        for ( int year = 1; year <= 10; year++){
            population = population + population/1000*(17-8);
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек.");

        }

    }
    public static void task4() {
        System.out.println("Задача 4");

        // Пишем код для задачи 4
        int savings = 15000;
        int totalSavings = 12_000_000;
        int months = 0;
        double currentSavings = 0;
        double zinsen = 0;
        while (currentSavings < totalSavings) {
            zinsen = (currentSavings + savings)*0.07;
            currentSavings = currentSavings + savings + zinsen;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений  " + currentSavings + " рублей.");
        }
        System.out.println(months + " месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей.");
        }
    public static void task5() {
        System.out.println("Задача 5");

        // Пишем код для задачи 5
        int savings = 15000;
        int totalSavings = 12_000_000;
        int months = 0;
        double currentSavings = 0;
        double zinsen = 0;
        while (currentSavings < totalSavings) {
            zinsen = (currentSavings + savings)*0.07;
            currentSavings = currentSavings + savings + zinsen;
            months++;
            if (months % 6 == 0)
            System.out.println("Месяц " + months + ", сумма накоплений  " + currentSavings + " рублей.");
        }
        System.out.println("Месяц " + months + ", сумма накоплений  " + currentSavings + " рублей.");
    }
    public static void task6() {
        System.out.println("Задача 6");

        // Пишем код для задачи 6
        int savings = 15000;
        double currentSavings = 0;
        double zinsen = 0;
        for (int months = 1; months <= 108; months++) {
            zinsen = (currentSavings + savings)*0.07;
            currentSavings = currentSavings + savings + zinsen;
            if (months % 6 == 0)
                System.out.println("Месяц " + months + ", сумма накоплений  " + currentSavings + " рублей.");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");

        // Пишем код для задачи 7
        int firstFriday = 5;
       for (int day = firstFriday; day <= 31; day+=7){
           System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет.");
       }

    }



    public static void task8() {
        System.out.println("Задача 8");

        // Пишем код для задачи 8
        int year = 2023;
        int yearFor200 = year-200;
        int yearAfter100 = year +100;
        for (; yearFor200 <= yearAfter100; yearFor200++){
            if (yearFor200 %79 ==0  )
                System.out.println(yearFor200);
        }
}
}
