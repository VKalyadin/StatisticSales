package ru.netology.stats;

public class StatsService {

    public int sumAllSales(long[] sales) {
        int sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public int averageMonthSales(long[] sales) {
        int aveSales = sumAllSales(sales) / sales.length;
        return aveSales;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int numMonthSalesBelowAverage(long[] sales) {
        int bellowAverage = 0;
        for (long sale : sales) {
            if (sale < averageMonthSales(sales)) {
                bellowAverage += 1;
            }

        }
        return bellowAverage;
    }

    public int numMonthSalesAboveAverage(long[] sales) {
        int aboveAverage = 0;
        for (long sale : sales) {
            if (sale > averageMonthSales(sales)) {
                aboveAverage += 1;
            }
        }
        return aboveAverage;
    }

}
