package automatedtest_tdd.translate_fizz_buzz;

public class FizzBuzzTranslate {
    public static String translate(int number){
        boolean isNumberOverZero = number > 0;
        if (isNumberOverZero){
            boolean isNumberDivised3 = number%3 == 0;
            boolean isNumberDivised5 = number%5 == 0;
            if((isNumberDivised3 && isNumberDivised5) || (isNumberInclude3(number) && isNumberInclude5(number))) return "FizzBuzz";
            else if (isNumberDivised3 || isNumberInclude3(number)) return "Fizz";
            else if (isNumberDivised5 || isNumberInclude5(number)) return "Buzz";
            else return readNumber(number);
//            if (isNumberInclude3(number) && isNumberInclude5(number)) return "FizzBuzz";
//            else if (isNumberInclude3(number)) return "Fizz";
//            else if (isNumberInclude5(number)) return "Buzz";
//            else return readNumber(number);
        }else return "số không hợp lệ";
    }
    public static boolean isNumberInclude3(int numer){
        String numberStr = Integer.toString(numer);
        boolean flag = false;
        for(int i =0; i < numberStr.length(); i++){
            if(numberStr.charAt(i) == '3'){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static boolean isNumberInclude5(int numer){
        String numberStr = Integer.toString(numer);
        boolean flag = false;
        for(int i =0; i < numberStr.length(); i++){
            if(numberStr.charAt(i) == '5'){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static String readNumber(int number){
        String translatedNumber = "";
        boolean isNumberUnder100 = number < 100;
        String[] ones = {"khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin", "muoi"};
        if(isNumberUnder100){
            if(number <= 10) translatedNumber = ones[number];
            else {
                int one = number%10;
                int ten = number/10;
                translatedNumber = ones[ten]+" ";
                translatedNumber += ones[one];
            }
            return translatedNumber;
        }else return Integer.toString(number);
    }
}
