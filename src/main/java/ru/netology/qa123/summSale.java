package ru.netology.qa123;

public class summSale {

    public int summ(int[] sales) {
        int summMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            summMonth = summMonth+ sales[i];
        }
        return summMonth;
    }
}
