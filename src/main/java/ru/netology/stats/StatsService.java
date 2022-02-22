package ru.netology.stats;

public class StatsService {
    public int minSales(int[] salesByMonth) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : salesByMonth) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= salesByMonth[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int sumAllSales(int[] salesByMonth) { //Сумму всех продаж
        int summa = 0;
        for (int saleMonth : salesByMonth) {
            summa += saleMonth;
        }
        return summa;
    }

    public int averageSalesSumInMonth(int[] salesByMonth) { //Среднюю сумму продаж в месяц
        return sumAllSales(salesByMonth) / salesByMonth.length;
    }

    public int maxPeakSalesInMonth(int[] salesByMonth) { //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
        int maxSalesMonth = 0;
        int month = 0;
        for (int saleMonth : salesByMonth) {
            if (saleMonth >= salesByMonth[maxSalesMonth]) {
                maxSalesMonth = month;
            }
            month = month + 1;
        }
        return maxSalesMonth + 1;
    }

    public int numberOfMonthsInWhichSalesWereBelowAverage(int[] salesByMonth) { //Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
        int monthsAmount = 0;
        int averageSalesSumInMonth = averageSalesSumInMonth(salesByMonth);
        for (int saleMonth : salesByMonth) {
            if (saleMonth < averageSalesSumInMonth) {
                monthsAmount += 1;

            }
        }
        return monthsAmount;
    }

    public int numberOfMonthsInWhichSalesWereAboveAverage(int[] salesByMonth) { //Кол-во месяцев, в которых продажи были выше среднего
        int monthsAmount = 0;
        int averageSalesSumInMonth = averageSalesSumInMonth(salesByMonth);
        for (int saleMonth : salesByMonth) {
            if (saleMonth > averageSalesSumInMonth) {
                monthsAmount += 1;

            }
        }
        return monthsAmount;
    }


}

