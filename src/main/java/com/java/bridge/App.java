package com.java.bridge;

public class App {
    public static void main(String[] args) {
        Champion kdaAri = new Ari(new KDA());
        kdaAri.move();
        kdaAri.skillE();
        kdaAri.skillR();
    }
}
