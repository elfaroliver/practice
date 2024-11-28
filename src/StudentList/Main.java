package StudentList;

public class Main {
  public static void main(String[] args) {
    School school = new School();

    Student student1 = new Student("John Doe", 18, "1001");
    Student student2 = new Student("Jane Smith", 19, "1002");
    Student student3 = new Student("Emily Johnson", 20, "1003");

    System.out.println("\nSearching for a student by name:");
    Student searchedStudentByName = school.searchByName("John Doe");
    if (searchedStudentByName != null) {
      System.out.println("Found: " + searchedStudentByName);
    } else {
      System.out.println("Student missing.");
    }

    System.out.println("\nAdding a student by name:");
    boolean addedStudentByName = school.addStudent(student1);
    if (addedStudentByName) {
      System.out.println("Student added successfully");
    } else {
      System.out.println("Student could not be added");
    }

    System.out.print("\\nRemoving a student by ID");
    boolean removedStudentById = school.removeStudent(student1.getStudentId());
    if (removedStudentById) {
      System.out.println("Student removed successfully");
    } else {
      System.out.println("Student stays forever");
    }

    school.listStudents();
  }
}
