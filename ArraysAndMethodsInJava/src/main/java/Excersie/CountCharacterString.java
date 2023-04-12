package Excersie;
import java.util.Scanner;
public class CountCharacterString {
    public static void main(String[] args) {
        countCharacter();
    }

    public static void countCharacter(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the String :");
        String str = scanner.nextLine();
        System.out.println("Enter String want count :");
        char key = scanner.next().charAt(0);
        String str1 = str.toUpperCase();
        char key1 = Character.toUpperCase(key);
        for (int i =0; i<str.length();i++){
            if(str1.charAt(i) == key1){
                count++;
            }
        }
        System.out.println("Char "+key+" have "+count+" in array");
    }
}
