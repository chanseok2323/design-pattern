package com.java.factorymethod;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "chanseok2323@gmail.com");
        System.out.println("whiteship = " + whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "chanseok2323@gmail.com");
        System.out.println("blackship = " + blackship);
    }
}
