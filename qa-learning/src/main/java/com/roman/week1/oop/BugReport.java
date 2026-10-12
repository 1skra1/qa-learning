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

    public void markFixed() {
        fixed = true;
    }

    public void setSeverity(double severity) {
        if (severity >= 0 && severity <= 10) {
            this.severity = severity;
        } else {
            System.out.println("Invalid severity: " + severity);
        }
    }

    public void printInfo() {
        System.out.println("Bug #" + id + ": " + title + " | priority: " + priority + " | severity: " + severity
                + " | fixed: " + fixed);
    }

}