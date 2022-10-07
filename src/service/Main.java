package service;

import entities.Load;
import entities.Order;

import java.util.Scanner;

public class Main {
    static Scanner m = new Scanner(System.in);

    public static void main(String[] args) {
        DeliveryCompanyService deliveryCompanyService = new DeliveryCompanyService();
        String command = "null";
        while (!command.equals("x")) {
            System.out.println("-------commands-------");
            System.out.println("1-Accept Order");
            System.out.println("2-Create delivery Company");
            System.out.println("3-Get TotalFee");
            System.out.println("4-Get Company Profit");
            System.out.println("---------------------");
            int choose = m.nextInt();
            switch (choose) {
                case 1 -> {
                    try {
                        deliveryCompanyService.acceptOrder(new Order(3, new Load(m.nextInt(), m.nextInt()
                                , m.nextInt(), m.nextInt())), m.nextLine(), m.nextLine());

                    } catch (Exception e) {
                        System.out.println("ERROR");

                    }
                }
                case 2 -> deliveryCompanyService.createDeliveryCompany();
                case 3 -> deliveryCompanyService.getTotalFee();
                case 4 -> deliveryCompanyService.getCompanyProfit();
                case 5 -> deliveryCompanyService.getCompanyProfit();


            }
        }
    }
}

