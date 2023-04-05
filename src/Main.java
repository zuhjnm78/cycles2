public class Main {
    public static void main(String[] args) {

        task1();
       // task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();

    }


    public static void task1() {

        System.out.println("Задача 1");

        // Пишем код для задачи 1

        int savings = 15000;
        int totalSavings = 2_459_000;
        int months = 0;
        int currentSavings = 0;
        while (currentSavings <= totalSavings)
            currentSavings = currentSavings + savings;
        months++;
            System.out.println("Месяц " +months +", сумма накоплений равна " + currentSavings +" рублей");
    }
}