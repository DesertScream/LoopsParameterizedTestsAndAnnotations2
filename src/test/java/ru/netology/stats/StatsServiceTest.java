package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(salesByMonth);
        assertEquals(expected, actual);

    }

    @Test
    void averageSalesSumMonth() {
        StatsService service = new StatsService();
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSalesSumMonth(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    void maxPeakSales() {
        StatsService service = new StatsService();
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxPeakSales(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    void theNumberOfMonthsIsBelowAverage() {
        StatsService service = new StatsService();
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.theNumberOfMonthsIsBelowAverage(salesByMonth);
        assertEquals(expected, actual);
    }

    @Test
    void theNumberOfMonthsIsAboveAverage() {
        StatsService service = new StatsService();
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.theNumberOfMonthsIsAboveAverage(salesByMonth);
        assertEquals(expected, actual);
    }
}
