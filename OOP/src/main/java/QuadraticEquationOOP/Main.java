package QuadraticEquationOOP;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter a: ");
        a=sc.nextDouble();
        System.out.println("Enter b: ");
        b=sc.nextDouble();
        System.out.println("Enter c: ");
        c=sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if(qe.getDiscriminant()<0) System.out.println("The equation has no roots");
        else if(qe.getDiscriminant()==0) System.out.println("The equation has one root: "+qe.getRoot1());
        else{
            System.out.println("The equation has two roots: ");
            System.out.println("Denta is: "+qe.getDiscriminant());
            System.out.println("Root1 is: "+qe.getRoot1());
            System.out.println("Root2 is: "+qe.getRoot2());
        }
    }
}
