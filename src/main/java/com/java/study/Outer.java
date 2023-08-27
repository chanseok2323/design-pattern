package com.java.study;

public class Outer {

    private static final String TEST_TEXT = "I'm TEST";

    static {
        System.out.println("1 - Initializing Class Outer, TEST_TEXT = " + TEST_TEXT);
    }

    public static void main(String[] args) {
        System.out.println("2 - TEST_TEXT = " + TEST_TEXT);
        System.out.println("3 - Inner.class =" + Inner.class);
        System.out.println("5 - Inner.info() = " + Inner.info());
    }

    private static class Inner {
        static {
            System.out.println("4 - Initializing Class Inner");
        }

        public static String info() {
            return "I'm Inner";
        }
    }
}
