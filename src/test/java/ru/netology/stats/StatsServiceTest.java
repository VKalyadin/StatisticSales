package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAllSales = 180;
        long actualAllSales = service.sumAllSales(sales);

        Assertions.assertEquals(expectedAllSales, actualAllSales);
    }

    @Test
    public void shouldFindAverageMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        long actualAverage = service.averageMonthSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMinMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        long actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMaxMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindNumMonthSalesBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNum = 5;
        long actualNum = service.numMonthSalesBelowAverage(sales);

        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void shouldFindNumMonthSalesAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNum = 5;
        long actualNum = service.numMonthSalesAboveAverage(sales);

        Assertions.assertEquals(expectedNum, actualNum);
    }

}
