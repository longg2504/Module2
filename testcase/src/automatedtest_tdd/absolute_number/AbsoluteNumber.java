package automatedtest_tdd.absolute_number;

public class AbsoluteNumber {
    public static int findAbs(int number) {
        if (number < 0) return number * -1;
        else return number;
    }
}
