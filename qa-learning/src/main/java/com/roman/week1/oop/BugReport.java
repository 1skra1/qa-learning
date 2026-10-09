package com.roman.week1.oop;

public class BugReport {
    private int id;
    private String title;
    private char priority;
    private double severity;
    private boolean fixed;

    public BugReport(int id, String title, char priority, double severity, boolean fixed) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.severity = severity;
        this.fixed = fixed;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public char getPriority() {
        return priority;
    }

    public double getSeverity() {
        return severity;
    }

    public boolean getFixed() {
        return fixed;
    }
}