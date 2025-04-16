package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.println("6. Search by City");
            System.out.println("7. Search by State");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter State: ");
                    String state = scanner.nextLine();
                    System.out.print("Enter Zip: ");
                    int zip = scanner.nextInt();
                    System.out.print("Enter Phone Number: ");
                    long phone = scanner.nextLong();
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    ContactPerson newContact = new ContactPerson(firstName, lastName, address, city, state, zip, phone, email);
                    addressBook.addContact(newContact);
                    break;

                case 2:
                    System.out.print("Enter First Name of Contact to Edit: ");
                    String editName = scanner.nextLine();
                    addressBook.editContact(editName);
                    break;

                case 3:
                    System.out.print("Enter First Name of Contact to Delete: ");
                    String deleteName = scanner.nextLine();
                    addressBook.deleteContact(deleteName);
                    break;

                case 4:
                    System.out.println("Contacts:");
                    addressBook.displayContacts();
                    break;

                case 5:
                    System.out.println("\n******************************");
                    System.out.println("Thank you for using Address Book!");
                    System.out.println("******************************\n");
                    return;
                    
                case 6:
                    System.out.print("Enter City to search: ");
                    String citySearch = scanner.nextLine();
                    addressBook.searchByCity(citySearch);
                    break;

                case 7:
                    System.out.print("Enter State to search: ");
                    String stateSearch = scanner.nextLine();
                    addressBook.searchByState(stateSearch);
                    break;


                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}


