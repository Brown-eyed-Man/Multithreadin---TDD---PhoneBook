package ru.netology;

import java.util.*;

public class PhoneBook {
    private static Map<String, String> phoneBook = new HashMap<>();

    public static int add(String name, String number) {
        phoneBook.putIfAbsent(name, number);
        return phoneBook.size();
    }

    public static String findByNumber(String number) {
        return null;
    }
}