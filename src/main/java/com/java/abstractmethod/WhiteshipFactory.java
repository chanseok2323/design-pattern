package com.java.abstractmethod;

import com.java.factorymethod.Ship;
import com.java.factorymethod.ShipFactory;
import com.java.factorymethod.WhiteShip;

public class WhiteshipFactory implements ShipFactory {

    private final ShipPartsFactory partsFactory;

    public WhiteshipFactory(ShipPartsFactory partsFactory) {
        this.partsFactory = partsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(partsFactory.createAnchor());
        ship.setWheel(partsFactory.createWheel());
        return ship;
    }
}
