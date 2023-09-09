package ru.netology.stats;

public class StatsService {


    //Пункт №1 общая сумма продаж за 12 месяцев
    public int getTotalAmount(int[] salesPerMonth) {
        int totalAmount = 0;

        for (int i = 0; i < salesPerMonth.length; i++) {
            totalAmount = totalAmount + salesPerMonth[i];
        }
        return totalAmount;

    }


    //Пункт №2 средняя сумма продаж в месяц
    public int getAverageSalesPerMonth(int[] salesPerMonth) {
        int averageSalesPerMonth = getTotalAmount(salesPerMonth) / 12;
        return averageSalesPerMonth;
    }


    //Пункт №3 номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int getMonthWithTheHighestSales(int[] salesPerMonth) {
        int monthWithTheHighestSales = 0;
        for (int i = 11; i >= 0; i--) {
            if (salesPerMonth[i] > salesPerMonth[monthWithTheHighestSales]) {
                monthWithTheHighestSales = i;
            }
        }
        return monthWithTheHighestSales + 1;
    }


    //Пункт №4 номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int getMonthWithMinimalSales(int[] salesPerMonth) {
        int monthWithMinimalSales = 0;
        for (int i = 11; i >= 0; i--) {
            if (salesPerMonth[i] < salesPerMonth[monthWithMinimalSales]) {
                monthWithMinimalSales = i;
            }
        }
        return monthWithMinimalSales + 1;
    }


    //Пункт №5 количество месяцев, в которых продажи были ниже среднего
    public int getNumberOfMonthsWithSalesBelowAverage(int[] salesPerMonth) {
        int numberOfMonthsWithSalesBelowAverage = 0;
        int salesBelowAverage = getAverageSalesPerMonth(salesPerMonth); //15
        for (int i = 0; i < salesPerMonth.length; i++) {
            if (salesPerMonth[i] < salesBelowAverage) {
                numberOfMonthsWithSalesBelowAverage++;
            }
        }
        return numberOfMonthsWithSalesBelowAverage;
    }


    //Пункт №6 количество месяцев, в которых продажи были выше среднего
    public int getNumberOfMonthsWithAboveAverageSales(int[] salesPerMonth) {
        int numberOfMonthsWithAboveAverageSales = 0;
        int averageSalesPerMonthNumberOfMonthsWithSalesBelowAverage = getAverageSalesPerMonth(salesPerMonth); //15
        for (int i = 0; i < salesPerMonth.length; i++) {
            if (salesPerMonth[i] >= averageSalesPerMonthNumberOfMonthsWithSalesBelowAverage) {
                numberOfMonthsWithAboveAverageSales++;
            }
        }
        return numberOfMonthsWithAboveAverageSales;
    }
}



