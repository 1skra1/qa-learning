package com.roman.week1;

import java.util.ArrayList;
import java.util.List;

public class BugTraker {
    public static void main(String[] args) {
        List<String> bugs = new ArrayList<>();
        bugs.add("500 при загрузке проверки");
        bugs.add("400 при загрузке задачи");
        bugs.add("501 при загрузке опросов");
        bugs.add("403 при загрузке аудита");
        System.out.println("Total bugs: " + bugs.size());
        for (int i = 0; i < bugs.size(); i++) {
            System.out.println("Bug " + (i + 1) + ": " + bugs.get(i));
        }

        for (String bug : bugs) {
            System.out.println(bug);
        }
        bugs.add("500 при загрузке быстрого опроса");
        System.out.println("Total bugs: " + bugs.size());
    }
}