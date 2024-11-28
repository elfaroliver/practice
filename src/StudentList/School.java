package StudentList;

import java.util.ArrayList;

public class School {
  private ArrayList<Student> students;

  public School() {
    this.students = new ArrayList<>();
  }

  public boolean addStudent(Student student) {
    return students.add(student);
  }

  public boolean removeStudent(String studentId) {
    for (Student student : students ) {
      if (student.getStudentId().equals(studentId)) {
        students.remove(student);
        return true;
      }
    }
    return false;
  }

  public Student searchByName(String name) {
    for (Student student : students) {
      if (student.getName().equalsIgnoreCase(name)) {
        return student;
      }
    }
    return null;
  }

  public Student searchById(String studentId) {
    for (Student student : students) {
      if (student.getStudentId().equalsIgnoreCase(studentId)) {
        return student;
      }
    }
    return null;
  }

  public void listStudents() {
    if (students.isEmpty()) {
      System.out.println("No students attend this school");
    } else {
      for (Student student : students) {
        System.out.println(student.toString());
      }
    }
  }

  public static void main(String[] args) {

  }
}
