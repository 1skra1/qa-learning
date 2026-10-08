package com.roman.week1;

public class Basics {
    public static void main(String[] args) {
        int bugId = 101;
        String name = "Login fails";
        char priority = 'H';
        double severity = 7.5;
        boolean fixed = false;
        System.out.println("Bug #" + bugId + ": " + name + " | priority: " + priority + " | severity: " + severity
                + " | fixed: " + fixed);

        if (priority == 'H') {
            System.out.println("Чинить сегодня");
        } else if (priority == 'M') {
            System.out.println("В этом спринте");
        } else if (priority == 'L') {
            System.out.println("В бэклог");
        } else {
            System.out.println("Неизвестный приоритет");
        }

        switch (priority) {
            case 'H', 'h' -> System.out.println("Чинить сегодня");
            case 'M' -> System.out.println("В этом спринте");
            case 'L' -> System.out.println("В бэклог");
            default -> System.out.println("Неизвестный приоритет");
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": Full run");
            } else if (i % 3 == 0) {
                System.out.println(i + ": Smoke");
            } else if (i % 5 == 0) {
                System.out.println(i + ": Regression");
            } else {
                System.out.println(i);
            }
        }
        if (isPassed(5, 5)) {
            System.out.println("Test 1: PASSED");
        } else {
            System.out.println("Test 1: FAILED");
        }
        if (isPassed(5, 3)) {
            System.out.println("Test 2: PASSED");
        } else {
            System.out.println("Test 2: FAILED");
        }
        if (isPassed(-1, 1)) {
            System.out.println("Test 3: PASSED");
        } else {
            System.out.println("Test 3: FAILED");
        }
    }

    static boolean isPassed(int expected, int actual) {
        return expected == actual;
    }
}