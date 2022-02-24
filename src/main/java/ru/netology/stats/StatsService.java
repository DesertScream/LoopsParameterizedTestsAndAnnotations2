package ru.netology.stats;

public class StatsService {
    public int minSales(int[] salesByMonth) {
        int minSalesMonth = 0;
        int month = 0;
        for (int saleByMonth : salesByMonth) {
            if (saleByMonth <= salesByMonth[minSalesMonth]) {
                minSalesMonth = month;
            }
            month = month + 1;
        }
        return minSalesMonth + 1;
    }

    public int calculateSum(int[] salesByMonth) { //Сумму всех продаж
        int sum = 0;
        for (int saleByMonth : salesByMonth) {
            sum += saleByMonth;
        }
        return sum;
    }

    public int averageSalesSumMonth(int[] salesByMonth) { //Среднюю сумму продаж в месяц
        return calculateSum(salesByMonth) / salesByMonth.length;
    }

    public int maxPeakSales(int[] salesByMonth) { //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
        int maxSalesMonth = 0;
        int month = 0;
        for (int saleByMonth : salesByMonth) {
            if (saleByMonth >= salesByMonth[maxSalesMonth]) {
                maxSalesMonth = month;
            }
            month = month + 1;
        }
        return maxSalesMonth + 1;
    }

    public int theNumberOfMonthsIsBelowAverage(int[] salesByMonth) { //Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
        int monthsAmount = 0;
        int averageSalesSumMonth = averageSalesSumMonth(salesByMonth);
        for (int saleByMonth : salesByMonth) {
            if (saleByMonth < averageSalesSumMonth) {
                monthsAmount += 1;

            }
        }
        return monthsAmount;
    }

    public int theNumberOfMonthsIsAboveAverage(int[] salesByMonth) { //Кол-во месяцев, в которых продажи были выше среднего
        int monthsAmount = 0;
        int averageSalesSumMonth = averageSalesSumMonth(salesByMonth);
        for (int saleByMonth : salesByMonth) {
            if (saleByMonth > averageSalesSumMonth) {
                monthsAmount += 1;

            }
        }
        return monthsAmount;
    }


}

