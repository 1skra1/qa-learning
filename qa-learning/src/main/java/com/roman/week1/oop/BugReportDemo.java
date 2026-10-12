package com.roman.week1.oop;

public class BugReportDemo {
    public static void main(String[] args) {
        BugReport bug1 = new BugReport(101, "Login fails", 'H', 7.5, false);
        System.out.println(bug1.getId() + ": " + bug1.getTitle());
        BugReport bug2 = new BugReport(102, "Registration fails", 'M', 5.0, false);
        System.out.println(bug2.getId() + ": " + bug2.getTitle());
        UiBug uiBug = new UiBug(103, "Key not work in Chrome", 'H', 6.5, false, "сhrome");
        uiBug.printInfo();
        System.out.println("Browser: " + uiBug.getBrowser());
        bug1.printInfo();
        bug1.setSeverity(15);
        bug1.setSeverity(9);
        bug1.markFixed();
        bug1.printInfo();
    }
}