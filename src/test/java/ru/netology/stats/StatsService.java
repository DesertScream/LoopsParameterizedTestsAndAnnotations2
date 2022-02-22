package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsService {
    @Test
    void shouldSummaSails() {
        StatsService service = new StatsService();
        int[] salesByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.shouldSummaSails(salesByMonth);
        assertEquals(expected, actual);

    }
}