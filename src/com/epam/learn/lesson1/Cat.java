package com.epam.learn.lesson1;

public class Cat implements Animal{
    private int b;
    private boolean bol;
    private short c;

    @Override
    public String toString() {
        return "Cat{" +
                "b=" + b +
                ", bol=" + bol +
                ", c=" + c +
                '}';
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean isBol() {
        return bol;
    }

    public void setBol(boolean bol) {
        this.bol = bol;
    }

    public short getC() {
        return c;
    }

    public void setC(short c) {
        this.c = c;
    }
}
