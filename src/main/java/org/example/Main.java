package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contact> list = new ArrayList<>();
        list.add(new Contact("sdsdsd", "89679672299"));
        list.add(new Contact("erterte", "89683452345"));
        list.add(new Contact("hljkhlkh", "89706712333"));
        list.add(new Contact("aasaded", "894535435445"));
        Contact test = new Contact("Test3", "123123123123123");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addGrope("Job");
        phoneBook.addGrope("Friends");
        phoneBook.addContact("Other", new Contact("test1", "345345354445"));
        phoneBook.addContact("Job", new Contact("test1", "345345354445"));
        phoneBook.addContact("Friends", new Contact("test2", "12312312312331"));
        phoneBook.addContact("Job", test);
        phoneBook.addContact("Friends", test);
        phoneBook.searchByNumberInPhoneBook("12312312312331");
        phoneBook.searchByNameInGroup("test1");


        System.out.println(phoneBook);
    }
}