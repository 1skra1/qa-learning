package com.roman.week1.oop;

public class UiBug extends BugReport {
    private String browser;

    public UiBug(int id, String title, char priority, double severity, boolean fixed, String browser) {
        super(id, title, priority, severity, fixed);
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }
}