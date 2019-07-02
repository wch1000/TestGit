package cn.com.text.demo01;
import cn.com.text.demo01.Student;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!!!");
        System.out.println("Hello World!!!!");
        System.out.println("Hello World!!!!");
        Student student = new Student();
        student.setAge(18);
        student.setName("小明");
        student.setSex("男");
        System.out.println(student.toString());
    }
}
