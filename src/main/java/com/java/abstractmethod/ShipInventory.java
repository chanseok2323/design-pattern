package com.java.abstractmethod;

import com.java.factorymethod.Ship;
import com.java.factorymethod.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();

        System.out.println("ship.getAnchor().getClass() = " + ship.getAnchor().getClass());
        System.out.println("ship.getWheel().getClass() = " + ship.getWheel().getClass());
    }
}
