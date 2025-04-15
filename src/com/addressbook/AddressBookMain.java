import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

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
        long phoneNumber = scanner.nextLong();
        scanner.nextLine(); // clear newline
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        ContactPerson person = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.addContact(person);

        System.out.println("All Contacts:");
        addressBook.displayContacts();
    }
}
