package com.hirasawaYui;

public class Drink{
    private String name;
    private int price;
    private boolean isON;


    public Drink() {
    }

    public Drink(String name, int price, boolean isON) {
        this.name = name;
        this.price = price;
        this.isON = isON;
    }

    public void getDrink(int money){
        if (money >= this.price) {
            this.isON = true;
            System.out.println(name + "指示灯亮");
        }
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获取
     * @return isON
     */
    public boolean isIsON() {
        return isON;
    }

    /**
     * 设置
     * @param isON
     */
    public void setIsON(boolean isON) {
        this.isON = isON;
    }

    public String toString() {
        return "Drink{name = " + name + ", price = " + price + ", isON = " + isON + "}";
    }
}
