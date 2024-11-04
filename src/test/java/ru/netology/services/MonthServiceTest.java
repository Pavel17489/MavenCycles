package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MonthServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/month.csv")

    public void testVariant1(int expected, int income, int expense, int threshold) {

        MonthService service = new MonthService();

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
