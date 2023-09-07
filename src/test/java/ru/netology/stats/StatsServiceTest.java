package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {


    //Пункт №1 общая сумма продаж за 12 месяцев
    @Test
    public void calculationTotalSalesForTheYear() {

        StatsService service = new StatsService();

        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //данные массива

        int expected = 180; // ожидаемый результат
        int actual = service.getTotalAmount(salesPerMonth); //фактический результат

        Assertions.assertEquals(expected, actual);
    }


    //Пункт №2 средняя сумма продаж в месяц
    @Test
    public void calculationAverageSalesPerMonth() {

        StatsService service = new StatsService();

        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //данные массива

        int expected = 15; // ожидаемый результат
        int actual = service.getAverageSalesPerMonth(salesPerMonth); //фактический результат

        Assertions.assertEquals(expected, actual);

    }


    //Пункт №3 номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    @Test
    public void calculationMonthWithTheHighestSales() {

        StatsService service = new StatsService();

        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //данные массива

        int expected = 8; // ожидаемый результат
        int actual = service.getMonthWithTheHighestSales(salesPerMonth); //фактический результат

        Assertions.assertEquals(expected, actual);

    }


    //Пункт №4 номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    @Test
    public void calculationMonthWithMinimalSales() {

        StatsService service = new StatsService();

        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //данные массива

        int expected = 9; // ожидаемый результат
        int actual = service.getMonthWithMinimalSales(salesPerMonth); //фактический результат

        Assertions.assertEquals(expected, actual);

    }


    //Пункт №5 количество месяцев, в которых продажи были ниже среднего
    @Test
    public void calculationNumberOfMonthsWithSalesBelowAverage() {

        StatsService service = new StatsService();

        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //данные массива

        int expected = 5; // ожидаемый результат
        int actual = service.getNumberOfMonthsWithSalesBelowAverage(salesPerMonth); //фактический результат

        Assertions.assertEquals(expected, actual);
    }


    //Пункт №6 количество месяцев, в которых продажи были выше среднего
    @Test
    public void calculationNumberOfMonthsWithAboveAverageSales() {

        StatsService service = new StatsService();

        int[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //данные массива

        int expected = 7; // ожидаемый результат
        int actual = service.getNumberOfMonthsWithAboveAverageSales(salesPerMonth); //фактический результат

        Assertions.assertEquals(expected, actual);
    }
}


