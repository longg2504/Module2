package Exercise;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        NumberFormat fmt1 = NumberFormat.getInstance(new Locale("vi", "VN"));
        int usd , vnd ;

        System.out.println("Enter the dollar amount you want to convert: ");
        usd = scanner.nextInt();
        vnd = 23000 * usd;

        System.out.printf(fmt.format(usd) +" = " +fmt1.format(vnd) +" vnđ");

    }
}
