package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}