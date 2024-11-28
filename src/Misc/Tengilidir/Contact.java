package Misc.Tengilidir;

public class Contact {
  private String name;
  private String phoneNumber;

  public Contact(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String toString() {
    return "Contact{" +
            "name='" + name + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            '}';
  }

  public static void main(String[] args) {

  }
}
