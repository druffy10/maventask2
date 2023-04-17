package ru.netology.maventask.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;



public class RestMonthsCalculatorTest {

    @ParameterizedTest
//    @CsvSource({"10000, 3000, 20000, 3",
//           "100000, 60000, 150000, 2"})
    @CsvFileSource(resources = "/money.csv")
    public void testCalculateRestMonths(int income, int expenses, int threshold, int expectedRestMonths) {
        RestMonthsCalculator service = new RestMonthsCalculator();
        int restMonthsCount = service.calculateRestMonths(income, expenses, threshold);
        Assertions.assertEquals(expectedRestMonths, restMonthsCount);
    }
}

 /*   @Test
    public void testCalculateRestMonthsFirst() {
        RestMonthsCalculator service = new RestMonthsCalculator();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expectedRestMonths = 3;

        int actualRestMonths = service.calculateRestMonths(income, expenses, threshold);

        Assertions.assertEquals(expectedRestMonths, actualRestMonths);
    }

    @Test
    public void testCalculateRestMonthsSecond() {
        RestMonthsCalculator service = new RestMonthsCalculator();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expectedRestMonths = 2;

        int actualRestMonths = service.calculateRestMonths(income, expenses, threshold);

        Assertions.assertEquals(expectedRestMonths, actualRestMonths);
    }


  */