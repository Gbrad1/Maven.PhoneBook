package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    LinkedHashMap<String, ArrayList<String>> phoneBook;
    ArrayList<String> phoneNumbers;
    ArrayList<String> contactNames;

    public PhoneBook(LinkedHashMap<String, List<String>> map) {
        this.phoneBook = new LinkedHashMap<>();
    }

    public PhoneBook() {
        this.phoneBook = new LinkedHashMap<>();
        this.phoneNumbers = new ArrayList<>();
        this.contactNames = new ArrayList<>();
    }

    public void add(String name, String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
        this.phoneBook.put(name, phoneNumbers);
    }

    public void addAll(String name, String... newPhoneNumbers) {
        this.phoneNumbers.addAll(Arrays.asList(newPhoneNumbers));
        this.phoneBook.put(name, phoneNumbers);
    }

    public void remove(String name) {
        phoneBook.remove(name);
    }

    public Boolean hasEntry(String phoneNumber) {
        return phoneNumbers.contains(phoneNumber);
    }

    public List<String> lookup(String name) {
        return phoneBook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for (Map.Entry<String, ArrayList<String>> index : phoneBook.entrySet()) {
            if (index.getValue().contains(phoneNumber)) {
                return index.getKey();
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        for (Map.Entry<String, ArrayList<String>> index : phoneBook.entrySet()) {
            contactNames.add(index.getKey());
        }
        return contactNames;
    }

    public LinkedHashMap<String, ArrayList<String>> getMap() {
        return this.phoneBook;
    }



}
