package com.roman.week1;

public class TestRuns {
    public static void main(String[] args) {
        int[] durations = { 12, 45, 7, 30, 18 };
        int total = 0;
        int max = durations[0];  
        for (int i = 0; i < durations.length; i++) {
            System.out.println("Test " + (i + 1) + ": " + durations[i] + " sec");
            total = total + durations[i];
            if (durations[i] > max) {
                    max = durations[i];
            }
        }
        System.out.println("Total: " + total + " sec");
        System.out.println("Longest: " + max + " sec");
    }
    }