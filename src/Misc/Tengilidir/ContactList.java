package Misc.Tengilidir;

import java.util.ArrayList;

public class ContactList {
  private ArrayList<Contact> contacts;

  public ContactList() {
    this.contacts = new ArrayList<>();
  }

  public boolean addContact(Contact contact) {
    return contacts.add(contact);
  }

  public Contact searchByName(String name) {
    for (Contact contact : contacts ) {
      if (contact.getName().equalsIgnoreCase(name)) {
        return contact;
      }
    }
    return null;
  }

  public void listContacts() {
    if (contacts.isEmpty()) {
      System.out.println("There are no contacts");
    } else {
      for (Contact contact: contacts ) {
        System.out.println(contact.toString());
      }
    }
  }

  public static void main(String[] args) {

  }
}
