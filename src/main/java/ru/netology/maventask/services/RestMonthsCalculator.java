package ru.netology.maventask.services;

public class RestMonthsCalculator {
    public int calculateRestMonths(int income, int expenses, int threshold) {
        int balance = 0;
        int restMonthsCount = 0;

        for (int month = 0; month < 12; month++) {
            if (balance >= threshold) {
                restMonthsCount++;
                balance = balance - expenses;
                balance = balance / 3;
            } else {
                balance = balance + income - expenses;
            }
        }
        return restMonthsCount;
    }
}
