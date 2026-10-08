package com.roman.week1;

public class TestRuns {
    public static void main(String[] args) {
        int[] durations = { 12, 45, 7, 30, 18 };
        for (int i = 0; i < durations.length; i++) {
            System.out.println("Test " + (i + 1) + ": " + durations[i] + " sec");
        }
    }
}