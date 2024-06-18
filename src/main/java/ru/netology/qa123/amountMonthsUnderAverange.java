package ru.netology.qa123;

public class amountMonthsUnderAverange {
    public int AverageSales(int[] sales) {

        int totalSumm = 0;

        for (int i = 0; i < sales.length; i++) {
            totalSumm = totalSumm + sales[i];


        }

        return totalSumm / 12;
    }

    public int amountMonths (int[] sales) {
        int amountMonths = AverageSales(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amountMonths) {
                month++;
            }
        }
        return month;
    }

}

