package StudentList;

public class Student {
  private String name;
  private int age;
  private String studentId;

  public Student(String name, int age, String studentId) {
    this.name = name;
    this.age = age;
    this.studentId = studentId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String toString() {
    return name + "," + age + "," + studentId + ".";
  }

  public static void main(String[] args) {

  }
}
