package ru.netology.maventask.services;

import org.junit.jupiter.api.Assertions;
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
