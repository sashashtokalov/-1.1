package org.example;

import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthArray = new MonthData[12];

    public StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthArray.length; i++) {
            monthArray[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();
        if (!(1 <= monthNumber && 12 >= monthNumber)) {
            System.out.println("Вы ввели недопустимое значение, введите число от 1 до 12");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int dayNumber = scanner.nextInt();
        if (!(1 <= dayNumber && 30 >= dayNumber)) {
            System.out.println("Вы ввели недопустимое значение, введите число от 1 до 30");
            return;
        }

        int stepsNumber = scanner.nextInt();
        System.out.println("Введите количество шагов ");
        if (stepsNumber < 0) {
            System.out.println("Введите неотрицательное количество шагов");
            return;
        }
        MonthData month = monthArray[monthNumber-1];
        month.days[dayNumber-1] = stepsNumber;
    }
}
