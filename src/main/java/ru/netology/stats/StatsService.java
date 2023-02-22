package ru.netology.stats;

public class StatsService {

    public int totalSales(int[] sales) { // сумма всех продаж
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }
        return total;
    }

    public int averageMonthlySales(int[] sales) { // средняя сумма продаж в месяц
        int monthlySales = totalSales(sales) / 12;
        return monthlySales;
    }

    public int maxSales(int[] sales) { // номер месяца с максимальными продажами
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) { // номер месяца с минимальными продажами
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int underAverageMonthlySales(int[] sales) { // количество месяцев ниже среднего уровня продаж
        int underMonthlySales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageMonthlySales(sales)) {
                underMonthlySales++;
            }
        }
        return underMonthlySales;
    }

    public int overAverageMonthlySales(int[] sales) { // количество месяцев выше среднего уровня продаж
        int overMonthlySales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageMonthlySales(sales)) {
                overMonthlySales++;
            }
        }
        return overMonthlySales;
    }
}
