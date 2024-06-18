package ru.netology.qa123;

public class AverageSumm {

    public int AverageSales(int[] sales) {

        int totalSumm = 0;

        for (int i = 0; i < sales.length; i++) {
            totalSumm = totalSumm+sales[i];


        }

        return totalSumm/12;
    }
}