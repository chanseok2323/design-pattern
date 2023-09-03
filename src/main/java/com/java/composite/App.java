package com.java.composite;

public class App {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        App app = new App();
        app.printPrice(doranBlade);
        app.printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println("component.getPrice() = " + component.getPrice());
    }
}
