package ClassJustWrite;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("after change value");
        student.display();
        student.setName("Long");
        student.setClasses("12B2");
        System.out.println("when set value ");
        student.display();
    }
}
