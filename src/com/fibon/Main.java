package com.fibon;

public class Main {

    static int getValue(int n) {
        int[] lastTwo = {0, 1};
        int counter = 2;

        while (counter <= n) {
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }

        return n > 1 ? lastTwo[1] : lastTwo[0];
    }

    public static void main(String[] args) {
        for (int i=0;i<=20;i++)
            System.out.println(i + " " + getValue(i));
    }
}
