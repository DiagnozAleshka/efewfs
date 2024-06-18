package ru.netology.qa123;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        summSale service = new summSale();
        int [] amountSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuallSum = service.summ(amountSale);
        System.out.println(actuallSum);

    }

}