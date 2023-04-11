package Excersie;
import java.util.Scanner;
public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Christan", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = input.nextLine();
        findName(input_name ,students);

    }

    public static void findName(String input_name , String[] students) {
        boolean isExist = false;
        for(int i = 0; i <students.length ; i++){
            if(students[i].equals(input_name)) {
                System.out.println("position of the students in the list " +input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("not found " + input_name + " is the list");
        }
    }
}