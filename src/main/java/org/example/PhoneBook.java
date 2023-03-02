package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<Contact>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public Map<String, List<Contact>> getPhoneBook() {
        return phoneBook;
    }

    public List<Contact> addGrope(String nameGroup) {
        List<Contact> list = new ArrayList<>();
        return  this.phoneBook.put(nameGroup, list);
    }

    public Map<String, List<Contact>> addContact(String nameGroup, Contact contact) {
        Map<String, List<Contact>> phoneBook = getPhoneBook();
        if (!phoneBook.containsKey(nameGroup)) {
            addGrope(nameGroup);
        }
        List<Contact> list = phoneBook.get(nameGroup);
        list.add(contact);
        return phoneBook;
    }

    public Contact searchByNumberInPhoneBook (String number) {
        Map<String, List<Contact>> phoneBook = getPhoneBook();
        Contact foundContact = new Contact("", "");
        for (Map.Entry<String, List<Contact>> contact: phoneBook.entrySet()) {
            for (Contact item: contact.getValue()) {
                if(item.getPhoneNumber().equals(number))
                foundContact = item;
            }
        }
        if (foundContact.getName().equals("")) {
            System.out.println("Контакт с номером " + number + " не найден");
        } else {
            System.out.println("Найдено одно совпадение: " + foundContact);
        }
        return foundContact;
    }


    @Override
    public String toString() {
        return phoneBook + "";
    }
}

