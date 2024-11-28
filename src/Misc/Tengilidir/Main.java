package Misc.Tengilidir;

public class Main {
  public static void main(String[] args) {
    ContactList contactlist = new ContactList();

    Contact contact1 = new Contact("Elfar Oliver", "8485607");
    Contact contact2 = new Contact("Pizzaplace", "1234567");

    contactlist.addContact(contact1);
    contactlist.addContact(contact2);

    Contact searchedContactByName = contactlist.searchByName("Elfar Oliver");
    if (searchedContactByName != null) {
      System.out.println("Contact found");
    } else {
      System.out.println("Contact not found");
    }

    contactlist.listContacts();
  }
}
