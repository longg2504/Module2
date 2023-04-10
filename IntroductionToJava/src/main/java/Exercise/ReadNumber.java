package Exercise;
import java.util.Scanner;
public class ReadNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number you want to read as words: ");
        int number = scanner.nextInt();
        System.out.println(NumberConversionsToWords(number,""));
    }

    protected static String NumberConversionsToWords(int number,String words){

        int  integerPart;
        int remainder=0;
        if (number>999) return words="out of ability";
        else if(number>=100){
            integerPart=(int)(number/100)*100;
            remainder = number % 100;
        }
        else if(number>=20) {
            integerPart=(int)(number/10)*10;
            remainder=number%10;
        }
        else integerPart=number;
        switch (integerPart) {
            case 0:
                words+="Zero";
                break;
            case 1:
                words+="one";
                break;
            case 2:
                words+="two";
                break;
            case 3:
                words+="three";
                break;
            case 4:
                words+="four";
                break;
            case 5:
                words+="five";
                break;
            case 6:
                words+="six";
                break;
            case 7:
                words+="seven";
                break;
            case 8:
                words+="eight";
                break;
            case 9:
                words+="nine";
                break;
            case  10:
                words+="ten";
                break;
            case 11:
                words+="eleven";
                break;
            case 12:
                words+="twelve";
                break;
            case 13:
                words+="thirteen";
                break;
            case 14:
                words+="fourteen";
                break;
            case 15:
                words+="fifteen";
                break;
            case 16:
                words+="sixteen";
                break;
            case 17:
                words+="seventeen";
                break;
            case 18:
                words+="eighteen";
                break;
            case 19:
                words+="nineteen";
                break;
            case 20:
                words+="twenty";
                break;
            case 30:
                words+="thirty";
                break;
            case 40:
                words+="forty";
                break;
            case 50:
                words+="fifty";
                break;
            case 60:
                words+="sixty";
                break;
            case 70:
                words+="seventy";
                break;
            case 80:
                words+="eighty";
                break;
            case 90:
                words+="ninety";
                break;
            case 100:
                words+="one hundred";
                break;
            case 200:
                words+="two hundred";
                break;
            case 300:
                words+="three hundred";
                break;
            case 400:
                words+="four hundred";
                break;
            case 500:
                words+="five hundred";
                break;
            case 600:
                words+="six hundred";
                break;
            case 700:
                words+="seven hundred";
                break;
            case 800:
                words+="eight hundred";
                break;
            case 900:
                words+="night hundred";
                break;

        }
        if(integerPart<20) return words;
        else return  NumberConversionsToWords( remainder,words+" ");

    }
}
