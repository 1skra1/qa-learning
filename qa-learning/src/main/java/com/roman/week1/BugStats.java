package com.roman.week1;

import java.util.HashMap;
import java.util.Map;

public class BugStats {
    public static void main(String[] args) {
        Map<String, Integer> bugsByPriority = new HashMap<>();
        bugsByPriority.put("High", 3);
        bugsByPriority.put("Medium", 5);
        bugsByPriority.put("Low", 2);
        System.out.println("High bugs: " + bugsByPriority.get("High"));
        bugsByPriority.put("Medium", 6);
        System.out.println("Medium bugs: " + bugsByPriority.get("Medium"));
        int total = 0;

        for (String priority : bugsByPriority.keySet()) {
            System.out.println(priority + ": " + bugsByPriority.get(priority));
            total = total + bugsByPriority.get(priority);
        }

        System.out.println("Total: " + total);
    }
}