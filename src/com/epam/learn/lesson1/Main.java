package com.epam.learn.lesson1;

public class Main {
    static int b;
    private boolean bol;
    private char c;

    static {
        b = 5;
    }

    public static void main(String[] args) {
        System.out.println(b);
    }

    private short getSum(short a, short b) {
        return (short) (a + b);
    }

    private int getSum(int i) {
        short a = 2;

        return i + 2;
    }

    public void getCount() {
        int a = 0;

        System.out.println(a);
    }
}
