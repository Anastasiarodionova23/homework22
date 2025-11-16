package main.java.com;

public class Main {
    public static void main(String[] args) {
        int priceTicket = 13676; // билет в рублях
        int rublOnMile = 20; // количество рублей для 1 мили
        int bonus = priceTicket / rublOnMile; // расчет миль

        System.out.println("За покупку билета стоимостью " + priceTicket + " рублей");
        System.out.println("Начислено " + bonus + " бонусных миль");
    }
}
