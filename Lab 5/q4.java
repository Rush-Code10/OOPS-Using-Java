public class q4 {
    public static void main(String[] args) {
        Student student = new Student();
        student.speak();

        Teacher teacher = new Teacher();
        teacher.speak();
    }
}

class Person {
    void speak() {
        System.out.println("The person is speaking");
    }
}

class Student extends Person {
    void speak() {
        System.out.println("The student is asking a question");
    }
}

class Teacher extends Person {
    void speak() {
        System.out.println("The teacher is giving a lecture");
    }
}
