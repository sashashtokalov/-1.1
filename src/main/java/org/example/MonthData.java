package org.example;

public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " день: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sum = 0;
        for (int day : days) {
            sum = sum + day;
        }
        return sum;
    }

    int maxSteps() {
        int maxDay = 0;
        for (int day : days) {
            if (maxDay < day) {
                maxDay = day;
            }
        }
        return maxDay;
    }

    int getBestSeries(int goalByStepsPerDay) {
        int series = 0;
        int maxSeries = 0;
        for (int day : days) {
            if (day >= goalByStepsPerDay) {
                series = series + 1;
                if (maxSeries < series) {
                    maxSeries = series;
                }
            } else {
                series = 0;
            }
        }
        return maxSeries;
    }
    int findAverageSteps(){
       return (sumStepsFromMonth()/days.length);
    }
}

