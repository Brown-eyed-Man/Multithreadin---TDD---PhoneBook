package ru.netology;

import java.util.*;

public class PhoneBook {
    private static Map<String, String> phoneBook = new HashMap<>();

    public static int add(String name, String number) {
        phoneBook.putIfAbsent(name, number);
        return phoneBook.size();
    }

    public static String findByNumber(String number) {
        if (phoneBook.containsValue(number)) {
            return phoneBook.entrySet()
                    .stream()
                    .filter(x -> x.getValue().equals(number))
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .get();
        }
        return "Абонент с таким номером не существует.";
    }

    public static String findByName(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return "Абонент с таким именем не существует.";
    }

    public static Map<String, String> getPhoneBook() {
        return phoneBook;
    }

    public static void printAllNames() {
        Set<String> set = new TreeSet<>(phoneBook.keySet());
        for (String s : set) {
            System.out.println(s);
        }
    }
}