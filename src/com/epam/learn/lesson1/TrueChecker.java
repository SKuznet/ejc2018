package com.epam.learn.lesson1;

public class TrueChecker {
    private String name;
    private boolean x;
    private boolean y = true;
    private boolean z;

    public static void main(String[] args) {
        boolean isGood = true;
        // WRONG!!!
//        private boolean isGood;
        TrueChecker checker = new TrueChecker();
        System.out.println(checker.isTrueA(checker.x, checker.y, checker.z));
    }

    private boolean isTrueA(boolean x, boolean y, boolean z) {
        return x && !(z || y) || !z;
    }

    private boolean isTrueB(boolean x, boolean y, boolean z) {
        return x && !(z || y) || !z;
    }

    private boolean isTrueC(boolean x, boolean y, boolean z) {
        return x && !(z || y) || !z;
    }

}
