package AccessModifier;

import java.sql.SQLOutput;

public class TestAccessModifier {
    public static void main(String[] args) {
        Circle sc = new Circle();
        System.out.println("ban kinh ban dau");
        System.out.println(sc.getRadius());
        System.out.println("dien tich hinh tron");
        System.out.println(sc.getArea());
        System.out.println("ban kinh sau khi dung getRadius");
        Circle sc1 = new Circle(5);
        System.out.println(sc1.getRadius());
        System.out.println("dien tinh hinh tron sau khi dung getRadius");
        System.out.println(sc1.getArea());


    }
}
