package SystematicLearningObjects;

public class ShapteTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red" , false);
        System.out.println(shape);
    }
}
