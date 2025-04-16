package com.addressbook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<ContactPerson> contacts = new ArrayList<>();

    public void addContact(ContactPerson contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (ContactPerson contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void editContact(String name) {
        for (ContactPerson contact : contacts) {
            if (contact.firstName.equalsIgnoreCase(name)) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter new Address: ");
                contact.address = scanner.nextLine();
                System.out.print("Enter new City: ");
                contact.city = scanner.nextLine();
                System.out.print("Enter new State: ");
                contact.state = scanner.nextLine();
                System.out.print("Enter new Zip: ");
                contact.zip = scanner.nextInt();
                System.out.print("Enter new Phone Number: ");
                contact.phoneNumber = scanner.nextLong();
                scanner.nextLine(); // Clear buffer
                System.out.print("Enter new Email: ");
                contact.email = scanner.nextLine();
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void deleteContact(String name) {
        for (ContactPerson contact : contacts) {
            if (contact.firstName.equalsIgnoreCase(name)) {
                contacts.remove(contact);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
    
    public void searchByCity(String city) {
        boolean found = false;
        for (ContactPerson contact : contacts) {
            if (contact.city.equalsIgnoreCase(city)) {
                System.out.println(contact);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found in city: " + city);
        }
    }

    public void searchByState(String state) {
        boolean found = false;
        for (ContactPerson contact : contacts) {
            if (contact.state.equalsIgnoreCase(state)) {
                System.out.println(contact);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found in state: " + state);
        }
    }
    
    public void countContactsByCity(String city) {
        long count = contacts.stream()
                .filter(contact -> contact.city.equalsIgnoreCase(city))
                .count();
        System.out.println("Total contacts in city '" + city + "': " + count);
    }

    public void countContactsByState(String state) {
        long count = contacts.stream()
                .filter(contact -> contact.state.equalsIgnoreCase(state))
                .count();
        System.out.println("Total contacts in state '" + state + "': " + count);
    }


}
