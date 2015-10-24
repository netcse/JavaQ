package tutorials.slidenerd.javaoop;

/**
 * Created by Microsoft on 10/6/2015.
 */
public class SuperClassReferenceVariable {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();

        Student s1 = new Student();
        Student s2 = new Student();

        // All info of Person present in Student
        Person p3 = new Student();

        // Without typecast
        // But all info of Student needed is
        // not present in Person class
        Student s3 = (Student) p3; // works
        System.out.println(s3);
    }
}

class Person {
    String name;
    int age;
    String address;
}

class Student extends Person {
    int rollnumber;
    int marks;
}
