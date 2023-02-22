package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldCountTotalSales() { // сумма всех продаж
//        StatsService service = new StatsService();
//        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedTotal = 180;
        int actualTotal = service.totalSales(sales);

        Assertions.assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void shouldCountMonthlySales() { // средняя сумма продаж в месяц
//        StatsService service = new StatsService();
//        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedMonthlySales = 15;
        int actualMonthlySales = service.averageMonthlySales(sales);

        Assertions.assertEquals(expectedMonthlySales, actualMonthlySales);
    }

    @Test
    public void shouldFindMaxMonth() { // номер месяца с максимальными продажами
//        StatsService service = new StatsService();
//        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindMinMonth() { // номер месяца с минимальными продажами
//        StatsService service = new StatsService();
//        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldCountMonthsUnderMonthlySales() { // количество месяцев ниже среднего уровня продаж
//        StatsService service = new StatsService();
//        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedUnderMonthlySales = 5;
        int actualUnderMonthlySales = service.underAverageMonthlySales(sales);

        Assertions.assertEquals(expectedUnderMonthlySales, actualUnderMonthlySales);
    }

    @Test
    public void shouldCountMonthsOverMonthlySales() { // количество месяцев выше среднего уровня продаж
//        StatsService service = new StatsService();
//        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedOverMonthlySales = 5;
        int actualOverMonthlySales = service.overAverageMonthlySales(sales);

        Assertions.assertEquals(expectedOverMonthlySales, actualOverMonthlySales);
    }
}
