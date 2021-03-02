package demo;

import java.io.*;

/**
 * @author: zhengbing
 * @date: 2020/6/1
 * @email: mydreambing@126.com
 */
public class Student implements Serializable {

  private static final long serialVersionUID = 5414981694224185896L;
  private String name;
  private Integer age;
  private Integer score;
  private long studentId;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }

  @Override
  public String toString() {
    return "Student{" + "name='" + name + '\'' + ", age=" + age + ", score=" + score + '}';
  }

  public static void serialize() throws IOException {

    Student student = new Student();
    student.setName("zhengbing");
    student.setAge(30);
    student.setScore(99);

    ObjectOutputStream objectOutputStream =
        new ObjectOutputStream(new FileOutputStream(new File("student.txt")));
    objectOutputStream.writeObject(student);
    objectOutputStream.close();

    System.out.println("序列化成功！生成文件student.txt");
    System.out.println("=============================================");
  }

  public static void deserialize() throws IOException, ClassNotFoundException {
    ObjectInputStream objectInputStream =
        new ObjectInputStream(new FileInputStream(new File("student.txt")));
    Student student = (Student) objectInputStream.readObject();
    objectInputStream.close();

    System.out.println("反序列化的结果为：");
    System.out.println(student.toString());
  }

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    //    Student.serialize();
    Student.deserialize();
  }
}
