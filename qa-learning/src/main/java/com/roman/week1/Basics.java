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
    }
}