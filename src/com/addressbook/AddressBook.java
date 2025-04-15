package com.addressbook;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<ContactPerson> contacts = new ArrayList<>();

    public void addContact(ContactPerson contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void displayContacts() {
        for (ContactPerson contact : contacts) {
            System.out.println(contact);
        }
    }
}

