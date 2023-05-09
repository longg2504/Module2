package utils;

import java.util.regex.Pattern;

public class ValidateUtils {
    public static final String PHONE_REGEX = "^[0][1-9][0-9]{8,9}$";
    public static boolean isPhoneValid(String number) {
        return Pattern.compile(PHONE_REGEX).matcher(number).matches();
    }
}