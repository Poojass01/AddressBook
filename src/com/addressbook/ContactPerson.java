package com.addressbook;

public class ContactPerson {
    String firstName, lastName, address, city, state, email;
    long phoneNumber;
    int zip;

    public ContactPerson(String firstName, String lastName, String address, String city,
                         String state, int zip, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + address + ", " + city + ", " + state +
               " - " + zip + ", Phone: " + phoneNumber + ", Email: " + email;
    }
}

