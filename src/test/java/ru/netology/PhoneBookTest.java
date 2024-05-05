package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class PhoneBookTest {

    @Test
    public void addPhoneBookTest1() {
        String name = "Alexey";
        String number = "1";
        int expectedSize = 1;
        int result = PhoneBook.add(name, number);
        Assertions.assertEquals(expectedSize, result);
    }

    @Test
    public void addPhoneBookTest2() {
        String name = "Alexey";
        String number = "12";
        int expectedSize = 1;
        int result = PhoneBook.add(name, number);
        Assertions.assertEquals(expectedSize, result);
    }

    @Test
    public void addPhoneBookTest3() {
        String name = "Marina";
        String number = "12";
        int expectedSize = 2;
        int result = PhoneBook.add(name, number);
        Assertions.assertEquals(expectedSize, result);
    }

    @Test
    public void addPhoneBookTest4() {
        String name = "Marina";
        String number = "12";
        int expectedSize = 2;
        int result = PhoneBook.add(name, number);
        Assertions.assertEquals(expectedSize, result);
    }

    @Test
    public void addPhoneBookTest5() {
        String name = "Nikolay";
        String number = "123";
        int expectedSize = 3;
        int result = PhoneBook.add(name, number);
        Assertions.assertEquals(expectedSize, result);
    }

    @Test
    public void findByNumberTestPositive() {
        String number = "12";
        String expectedName = "Marina";
        String result = PhoneBook.findByNumber(number);
        Assertions.assertEquals(expectedName, result);
    }

    @Test
    public void findByNumberTestNegative() {
        String number = "55";
        String expectedName = "Абонент с таким номером не существует.";
        String result = PhoneBook.findByNumber(number);
        Assertions.assertEquals(expectedName, result);
    }

    @Test
    public void findByNameTestPositive() {
        PhoneBook.getPhoneBook().put("Alexey", "1");
        String name = "Alexey";
        String expectedNumber = "1";
        String result = PhoneBook.findByName(name);
        Assertions.assertEquals(expectedNumber, result);
    }

    @Test
    public void findByNameTestNegative() {
        String name = "Biden";
        String expectedNumber = "Абонент с таким именем не существует.";
        String result = PhoneBook.findByName(name);
        Assertions.assertEquals(expectedNumber, result);
    }

    @Test
    public void printAllNamesTest() {
        Set<String> names = new TreeSet<>();
        names.add("Nikolay");
        names.add("Alexey");
        names.add("Marina");

        Set<String> result = PhoneBook.getPhoneBook().keySet();
        PhoneBook.printAllNames();
        Assertions.assertEquals(names, result);
        }
}