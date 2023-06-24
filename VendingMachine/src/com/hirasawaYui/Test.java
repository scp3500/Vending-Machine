package com.hirasawaYui;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Drink soda = new Drink("汽水", 12, false);
        Drink tea = new Drink("花茶", 15, false);
        Drink coffee = new Drink("咖啡", 20, false);
        int money = 0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);

        while (!flag) {
            System.out.println("----------自动售货机----------");
            System.out.println("          请投入硬币          ");
            System.out.println("          1. 1元");
            System.out.println("          2. 5元");
            System.out.println("          3. 10元");
            System.out.println("          4. 选择饮料");
            System.out.println("          5. 退钱");
            System.out.println("          6. 退出");
            String choose1 = sc.next();

            switch (choose1) {
                case "1" -> money = money + 1;
                case "2" -> money = money + 5;
                case "3" -> money = money + 10;
                case "4" -> money = chooseDrink(money);
                case "5" -> {
                    if (money == 0){
                        System.out.println("您没有投入硬币");
                    }else {
                        refund(money);
                        money = 0;
                    }
                }
                case "6" -> flag = true;
                default -> System.out.println("没有这个选项");
            }
            if (money != 0) {
                System.out.println("已投入" + money + "元");
            }
            soda.getDrink(money);
            tea.getDrink(money);
            coffee.getDrink(money);
        }
    }

    private static int chooseDrink(int money) {
        Scanner sc = new Scanner(System.in);
        if (money < 12) {
            System.out.println("您投入的钱不够");
        }
        if (money >= 12 && money < 15) {
            System.out.println("是否要获得可乐");
            System.out.println("    1.是");
            System.out.println("    2.否");
            String choose2 = sc.next();
            switch (choose2) {
                case "1" -> {
                    money = money - 12;
                    System.out.println("获得可乐, 还剩" + money + "元");
                }
                case "2" -> {
                    refund(money);
                    money = 0;
                }
                default -> System.out.println("没有这个选项");
            }

        }
        if (money >= 15 && money < 20) {
            System.out.println("选择您要获取什么饮料");
            System.out.println("    1.可乐");
            System.out.println("    2.花茶");
            System.out.println("    3.退钱");
            String choose3 = sc.next();
            switch (choose3) {
                case "1" -> {
                    money = money - 12;
                    System.out.println("获得可乐, 还剩" + money + "元");
                }
                case "2" -> {
                    money = money - 15;
                    System.out.println("获得花茶, 还剩" + money + "元");
                }
                case "3" -> {
                    refund(money);
                    money = 0;
                }
                default -> System.out.println("没有这个选项");
            }

        }
        if (money >= 20) {
            System.out.println("选择您要获取什么饮料");
            System.out.println("    1.可乐");
            System.out.println("    2.花茶");
            System.out.println("    3.咖啡");
            System.out.println("    4.退钱");
            String choose4 = sc.next();
            switch (choose4) {
                case "1" -> {
                    money = money - 12;
                    System.out.println("获得可乐, 还剩" + money + "元");
                }
                case "2" -> {
                    money = money - 15;
                    System.out.println("获得花茶, 还剩" + money + "元");
                }
                case "3" -> {
                    money = money - 20;
                    System.out.println("获得咖啡, 还剩" + money + "元");
                }
                case "4" -> {
                    refund(money);
                    money = 0;
                }
                default -> System.out.println("没有这个选项");
            }
        }
        return money;
    }

    private static void refund(int money) {
        if (money < 10) {
            System.out.println("退回" + money + "张1元");
        }
        if (money >= 10 && money % 10 == 0) {
            System.out.println("退回" + (money / 10) + "张10元");
        }
        if (money >= 10 && money % 10 != 0) {
            System.out.println("退回" + (money / 10) + "张10元");
            System.out.println("退回" + (money % 10) + "张1元");
        }
    }
}
